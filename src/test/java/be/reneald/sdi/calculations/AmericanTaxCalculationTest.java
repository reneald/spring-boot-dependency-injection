package be.reneald.sdi.calculations;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmericanTaxCalculationTest {
    @Test
    public void calculateTaxes_whenGiven1000_shouldReturn1130() {
        final AmericanTaxCalculation testCalculation = new AmericanTaxCalculation();
        double expectedTaxes = 1130;
        Assertions.assertThat(testCalculation.calculateTaxes(1000)).isEqualTo(expectedTaxes);
    }

}