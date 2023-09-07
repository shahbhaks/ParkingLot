package repository;

import exception.GateNotFoundException;
import exception.ParkingSpotNotFoundException;
import model.Gate;
import model.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public  Gate get(int gateId){
        Gate gate=gateMap.get(gateId);
        if(gate==null){
            throw new GateNotFoundException("Gate not found with for id :"
                    + gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(),gate);
    }
}
