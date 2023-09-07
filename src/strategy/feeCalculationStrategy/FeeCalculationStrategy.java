package strategy.feeCalculationStrategy;

import model.Ticket;
import model.VehicleType;

public interface FeeCalculationStrategy {

    long getFeeAmount(Ticket ticket);
}
