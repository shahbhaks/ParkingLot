package service;

import model.*;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import strategy.spotAllocationStrategy.SpotAllocationFactory;
import strategy.spotAllocationStrategy.SpotAllocationStategy;

import java.time.LocalDateTime;

public class TicketService {

    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
    }

    public Ticket getTicket(VehicleType vehicleType, String vehicleNumber, String vehicleColour, String vehicleMake, int gateId){
        Gate gate=gateRepository.get(gateId);
       // ParkingLot parkingLot = parkingLotRepository.getParkingLotFromGate(gate);
        SpotAllocationStategy spotAllocationStategy= SpotAllocationFactory.getSpotAllocationStrategy(parkingLotRepository);
        ParkingSpot parkingSpot=spotAllocationStategy.getSpot(vehicleType,gate);
        parkingSpot.setStatus(Status.NOT_AVAILABLE);

        Ticket ticket=new Ticket();
        ticket.setVehicle(new Vehicle(vehicleNumber,vehicleColour,vehicleMake,vehicleType));
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        return ticket;


    }
}
