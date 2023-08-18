package org.example.repos;

import org.example.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {
    private final Map<Long, ParkingLot> parkingLots = new HashMap<>();
    private Long id = 0L;

    public ParkingLot save(ParkingLot parkingLot) {
        id++;
        parkingLot.setId(id);
        parkingLots.put(id, parkingLot);
        return parkingLot;
    }

    public ParkingLot getById(Long id) {
        return parkingLots.get(id);
    }

    public ParkingLot update(ParkingLot parkingLot) {
        parkingLots.put(parkingLot.getId(), parkingLot);
        return getById(parkingLot.getId());
    }
}
