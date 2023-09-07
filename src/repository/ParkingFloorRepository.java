package repository;

import exception.ParkingFloorNotFoundException;
import exception.ParkingLotNotFoundException;
import model.ParkingFloor;
import model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {

        this.parkingFloorMap = new HashMap<>();
    }

    public  ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor=parkingFloorMap.get(parkingFloorId);
        if(parkingFloor==null){
            throw new ParkingFloorNotFoundException("Parking Floor not found with for id :"
                    + parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){

        parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
    }
}
