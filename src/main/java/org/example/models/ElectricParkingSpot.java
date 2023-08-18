package org.example.models;

public class ElectricParkingSpot extends ParkingSpot {
    private ElectricCharger electricCharger;

    public ElectricParkingSpot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
