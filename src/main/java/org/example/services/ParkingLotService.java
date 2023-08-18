package org.example.services;

import org.example.models.ParkingLot;
import org.example.repos.ParkingLotRepo;

public class ParkingLotService {
    private ParkingLotRepo parkingLotRepo;

    public ParkingLotService(ParkingLotRepo parkingLotRepo) {
        this.parkingLotRepo = parkingLotRepo;
    }

    public ParkingLot createParkingLot() {
        return null;
    }

    public ParkingLot updateAddress() {
        return null;
    }
}
