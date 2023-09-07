package strategy.spotAllocationStrategy;

import exception.ParkingSpotNotFoundException;
import model.*;
import repository.ParkingLotRepository;

public class RandomSpotAllocationStrategy implements SpotAllocationStategy {

    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAllocationStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    /***
     * Suppose there are multiple floors and each floor has gate(entry and exit)
     * so firstly, you need to provide the spot in the same floor as gate
     * secondly, if no spot availble in the same floor, provide random spot of any floor
     * @param vehicleType
     * @param gate
     * @return parkingLot
     */

    @Override
    public ParkingSpot getSpot(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot=parkingLotRepository.getParkingLotFromGate(gate);
        int currentFloor = gate.getFloorNumber();

        //1.spot in the same floor as gate
        ParkingFloor parkingFloor = parkingLot.getParkingFloors().get(currentFloor-1);
        for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
            if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
                    && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                return parkingSpot;
            }
        }

        //2.random spot
        for(ParkingFloor floor:parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot:floor.getParkingSpots()){
                if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
                && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundException("No Parking Spot available for this vehicle type : " + vehicleType.name());
    }
}
