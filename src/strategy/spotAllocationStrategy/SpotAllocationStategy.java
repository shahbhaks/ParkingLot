package strategy.spotAllocationStrategy;

import model.Gate;
import model.ParkingSpot;
import model.VehicleType;

public interface SpotAllocationStategy {

    ParkingSpot getSpot(VehicleType vehicleType, Gate gate);
}
