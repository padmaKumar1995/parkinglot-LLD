package org.example.strategies.spotassignment;

import org.example.models.ParkingLot;
import org.example.models.ParkingSpot;
import org.example.models.Vehicle;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle);
}
