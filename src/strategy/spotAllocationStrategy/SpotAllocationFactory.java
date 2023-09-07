package strategy.spotAllocationStrategy;

import repository.ParkingLotRepository;

public class SpotAllocationFactory {

    public static SpotAllocationStategy getSpotAllocationStrategy(ParkingLotRepository parkingLotRepository){
        return new RandomSpotAllocationStrategy(parkingLotRepository);

    }
}
