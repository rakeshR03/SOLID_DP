package designpattern.behavioural.strategy;

public class ClearTax {
    private TaxCalculatingStrategyFactory taxCalculatingStrategyFactory = new TaxCalculatingStrategyFactory();

    public double calculateTax(TaxCalculatingStrategyType type, int salaryAmount){
        return taxCalculatingStrategyFactory.getTaxCalculatingStrategy(type).calculateTax(salaryAmount);
    }
}
