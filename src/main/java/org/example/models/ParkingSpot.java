package org.example.models;

import org.example.models.enums.ParkingSpotStatus;
import org.example.models.enums.SpotType;
import org.example.models.enums.VehicleType;

public class ParkingSpot extends BaseModel {
    private int spotNumber;
    private ParkingFloor parkingFloor;
    private VehicleType spotType;
    private ParkingSpotStatus parkingSpotStatus;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public VehicleType getSpotType() {
        return spotType;
    }

    public void setSpotType(VehicleType spotType) {
        this.spotType = spotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
