package org.example.controllers;

import org.example.models.EntryGate;
import org.example.models.ParkingLot;
import org.example.models.Ticket;
import org.example.models.Vehicle;
import org.example.services.TicketService;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate, Long parkingLotId) {
        return ticketService.generateTicket(vehicle, entryGate, parkingLotId);
    }
}
