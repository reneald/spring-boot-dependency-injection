package be.reneald.sdi;

import be.reneald.sdi.calculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class TaxCalculator {
    private TaxCalculation taxCalculation;

    @Inject
    public TaxCalculator(@Qualifier("AmericanTaxCalculationBean") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxes(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
