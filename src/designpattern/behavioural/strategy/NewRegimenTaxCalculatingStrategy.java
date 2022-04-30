package designpattern.behavioural.strategy;

public class NewRegimenTaxCalculatingStrategy implements TaxCalculatingStrategy{
    @Override
    public double calculateTax(int salaryAmount) {
        double pf = 0.05 * salaryAmount;
        double ec = 0.15 *salaryAmount;


        double tax = pf + ec;

        return tax;

    }
}
