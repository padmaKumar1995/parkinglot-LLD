package org.example.strategies.spotassignment;

import org.example.models.ParkingFloor;
import org.example.models.ParkingLot;
import org.example.models.ParkingSpot;
import org.example.models.Vehicle;
import org.example.models.enums.ParkingSpotStatus;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    //assigning first available spot for the vehicle
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, Vehicle vehicle) {
        for(ParkingFloor floor: parkingLot.getParkingFloors()) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                        && spot.getSpotType().equals(vehicle.getVehicleType())) {
                    return spot;
                }
            }
        }
        return null;
    }
}
