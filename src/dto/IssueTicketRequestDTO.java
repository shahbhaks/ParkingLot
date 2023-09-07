package dto;

import model.VehicleType;

public class IssueTicketRequestDTO {

    private VehicleType vehicleType;
    private String vehicleNumber;
    private String vehicleColour;
    private String vehicleMake;
    private int gateId;

    public IssueTicketRequestDTO(){

    }

    public IssueTicketRequestDTO(VehicleType vehicleType, String vehicleNumber, String vehicleColour, String vehicleMake, int gateId) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleColour = vehicleColour;
        this.vehicleMake = vehicleMake;
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }
}
