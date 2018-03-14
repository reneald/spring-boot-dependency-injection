package be.reneald.sdi.calculations;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;

@Named
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    private static final double BELGIAN_TAX_RATE = 0.45;

    @Override
    public double calculateTaxes(double yearlyIncome) {

        return yearlyIncome * BELGIAN_TAX_RATE;
    }
}
