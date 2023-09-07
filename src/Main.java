import model.ParkingLot;
import repository.ParkingLotRepository;
import service.InitialisationService;

public class Main {

    private InitialisationService initialisationService;

    private ParkingLotRepository parkingLotRepository;

    public Main(){
        this.initialisationService=new InitialisationService();
        this.parkingLotRepository=new ParkingLotRepository();
    }
    public static void main(String[] args) {
        Main main=new Main();
        ParkingLot parkingLot=main.initialisationService.initialise();


    }
}