package model;

public class Vehicle extends BaseModel{

    private String number;
    private String colour;
    private String make;
    private VehicleType vehicleType;

    public Vehicle(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", colour='" + colour + '\'' +
                ", make='" + make + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public Vehicle(String number, String colour, String make, VehicleType vehicleType) {
        this.number = number;
        this.colour = colour;
        this.make = make;
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
