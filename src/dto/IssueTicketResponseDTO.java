package dto;

import model.Ticket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class IssueTicketResponseDTO {

    private ResponseStatus responseStatus;
    private String failureReason;
    private Ticket ticket;

    @Override
    public String toString() {
        HashMap<String,String> ticketData = new HashMap<>();
        ticketData.put("Response",responseStatus.toString());
        if(responseStatus.equals(ResponseStatus.FAILURE)){
            ticketData.put("Failure message", failureReason);
        }
        ticketData.put("Ticket id", String.valueOf(ticket.getId()));
        //
        ticketData.put("Vehicle number", ticket.getVehicle().getNumber());
        ticketData.put("Vehicle color", ticket.getVehicle().getColour());
        ticketData.put("Vehicle make", ticket.getVehicle().getMake());
        ticketData.put("Parking spot", String.valueOf(ticket.getParkingSpot().getNumber()));


        LocalDateTime entrDateTime=ticket.getEntryTime();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        ticketData.put("Entry time", entrDateTime.format(formatter));

       return ticketData.toString();
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
