package service;

import model.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {

    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public InitialisationService() {
        this.parkingLotRepository = new ParkingLotRepository();
        this.parkingFloorRepository =new ParkingFloorRepository();
        this.parkingSpotRepository = new ParkingSpotRepository();
        this.gateRepository = new GateRepository();
    }

    /***
     * This will create a parking lot with 10 floors and each floor having 10 spots
     * @return parking lot object
     */

    public ParkingLot initialise(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setStatus(Status.ACTIVE);
        parkingLot.setAddress("Road A, City C, State S");
        parkingLot.setCapacity(100);

        Gate entryGate = new Gate();
        entryGate.setId(1);
        entryGate.setOperator("Ram Kumar");
        entryGate.setGateNumber(1);
        entryGate.setGateType(GateType.ENTRY);
        entryGate.setFloorNumber(1);
        entryGate.setStatus(Status.ACTIVE);
       // entryGate.setParking(1);

        Gate exitGate = new Gate();
        exitGate.setId(2);
        exitGate.setOperator("Mohan Kumar");
        exitGate.setGateNumber(2);
        exitGate.setGateType(GateType.EXIT);
        exitGate.setFloorNumber(1);
        exitGate.setStatus(Status.ACTIVE);

        parkingLot.setGates(List.of(entryGate,exitGate)); //java 11
        gateRepository.put(entryGate);
        gateRepository.put(exitGate);

        List<ParkingFloor> parkingFloorsList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingFloor parkingFloor=new ParkingFloor();
            List<ParkingSpot> parkingSpotsList=new ArrayList<>();
            parkingFloor.setId(100 + i);
            parkingFloor.setStatus(Status.ACTIVE);
            parkingFloor.setFloorNo(i);
            //Each parking floor, will have 10 ParkingSpot
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot=new ParkingSpot();
                parkingSpot.setId(1000 + j);
                parkingSpot.setStatus(Status.AVAILABLE);
                parkingSpot.setNumber(i * 10 + j);  //1st floor=> 1*10+1=101, 102, 103
                //Random spot for vehicle
                if(j%2==0) parkingSpot.setSupportedVehicleType(VehicleType.Two_Wheeler);
                else parkingSpot.setSupportedVehicleType(VehicleType.Four_Wheeler);
                parkingSpotsList.add(parkingSpot); //add to Spot list
                parkingSpotRepository.put(parkingSpot); //save to Spot repo
            }

            parkingFloor.setParkingSpots(parkingSpotsList);
            parkingFloorsList.add(parkingFloor);//add to ParkingFloor list
            parkingFloorRepository.put(parkingFloor); //save to ParkingFloor repo

        }

        parkingLot.setParkingFloors(parkingFloorsList);
        parkingLotRepository.put(parkingLot);
        return parkingLot;


    }
}
