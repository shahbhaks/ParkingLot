package strategy.feeCalculationStrategy;

import model.Ticket;
import model.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FeeCalculationBasedOnPerMinRate implements FeeCalculationStrategy {

    private static final int PER_MIN_RATE_2_WHEELER=2;
    private static final int PER_MIN_RATE_4_WHEELER=5;

    @Override
    public long getFeeAmount(Ticket ticket) {
        LocalDateTime entryTime=ticket.getEntryTime();
        LocalDateTime currentTime=LocalDateTime.now();
        long numberOfMinutes= ChronoUnit.MINUTES.between(currentTime,entryTime);

        if(ticket.getVehicle().equals(VehicleType.Two_Wheeler)){
            return numberOfMinutes * PER_MIN_RATE_2_WHEELER;
        }
        else{
            return numberOfMinutes * PER_MIN_RATE_4_WHEELER;
        }
    }
}
