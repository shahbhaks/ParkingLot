import controller.TicketController;
import dto.IssueTicketRequestDTO;
import dto.IssueTicketResponseDTO;
import model.ParkingLot;
import model.VehicleType;
import repository.*;
import service.InitialisationService;
import service.TicketService;

public class Main {

    private InitialisationService initialisationService;
    private TicketController ticketController;


    public Main(){
        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository=new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository=new ParkingSpotRepository();
        TicketRepository ticketRepository=new TicketRepository();
        GateRepository gateRepository=new GateRepository();

        this.initialisationService=new InitialisationService(parkingLotRepository,parkingFloorRepository,parkingSpotRepository,gateRepository);

        this.ticketController=new TicketController(new TicketService(ticketRepository,parkingLotRepository,gateRepository));


    }
    public static void main(String[] args) {
        Main main=new Main();
        ParkingLot parkingLot=main.initialisationService.initialise();

        IssueTicketRequestDTO issueTicketRequestDTO= new IssueTicketRequestDTO(VehicleType.Four_Wheeler,"ABCD1234","Black","Mercedez",1);
        IssueTicketResponseDTO responseDTO=main.ticketController.getTicket(issueTicketRequestDTO);

        System.out.println(responseDTO);

    }
}