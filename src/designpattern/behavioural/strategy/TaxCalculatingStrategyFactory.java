package designpattern.behavioural.strategy;

public class TaxCalculatingStrategyFactory {
    public TaxCalculatingStrategy getTaxCalculatingStrategy(TaxCalculatingStrategyType type){
        switch(type){
            case NEW:
                return new NewRegimenTaxCalculatingStrategy();

            case OLD:
                return new OldRegimenTaxCalculatingStrategy();
        }
        return null;
    }
}
