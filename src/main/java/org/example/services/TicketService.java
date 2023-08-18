package org.example.services;

import org.example.models.EntryGate;
import org.example.models.Ticket;
import org.example.models.Vehicle;
import org.example.repos.ParkingLotRepo;
import org.example.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {
    private final ParkingLotRepo parkingLotRepo;
    private final SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(ParkingLotRepo parkingLotRepo, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.parkingLotRepo = parkingLotRepo;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate, Long parkingLotId) {
        var parkingLot = this.parkingLotRepo.getById(parkingLotId);
        var parkingSpot = this.spotAssignmentStrategy.assignSpot(parkingLot, vehicle);

        if(parkingSpot == null) {
            return null;
        }

        Ticket ticket = new Ticket();
        ticket.setEntryGate(entryGate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);

        return ticket;
    }
}
