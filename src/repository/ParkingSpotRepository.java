package repository;

import exception.ParkingFloorNotFoundException;
import exception.ParkingSpotNotFoundException;
import model.ParkingFloor;
import model.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {

    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public  ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot=parkingSpotMap.get(parkingSpotId);
        if(parkingSpot==null){
            throw new ParkingSpotNotFoundException("Parking Spot not found with for id :"
                    + parkingSpotId);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot parkingSpot){
        parkingSpotMap.put(parkingSpot.getId(),parkingSpot);
    }
}
