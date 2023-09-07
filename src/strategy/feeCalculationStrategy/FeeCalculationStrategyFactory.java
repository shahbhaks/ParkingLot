package strategy.feeCalculationStrategy;

public class FeeCalculationStrategyFactory {

    public static FeeCalculationStrategy getFeeCalculationStrategy(){
        return new FeeCalculationBasedOnPerMinRate();
    }
}
