package repository;

import exception.GateNotFoundException;
import exception.TicketNotFoundException;
import model.Gate;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {

        this.ticketMap = new HashMap<>();
    }

    public  Ticket get(int ticketId){
        Ticket ticket=ticketMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket not found with for id :"
                    + ticketId);
        }
        return ticket;
    }

    public void put(Ticket ticket){

        ticketMap.put(ticket.getId(),ticket);
    }
}
