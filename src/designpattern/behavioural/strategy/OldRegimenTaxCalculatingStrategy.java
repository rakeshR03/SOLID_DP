package designpattern.behavioural.strategy;

public class OldRegimenTaxCalculatingStrategy implements TaxCalculatingStrategy{
    @Override
    public double calculateTax(int salaryAmount) {
        double pf = 0.05 * salaryAmount;
        double ec = 0.2 * salaryAmount;
        double hra = 0.1 * salaryAmount;

        double tax = (pf + ec)-hra;

        return tax;
    }
}
