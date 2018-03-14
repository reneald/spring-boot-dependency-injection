package be.reneald.sdi.calculations;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BelgianTaxCalculationTest {
    @Test
    public void calculateTaxes_whenGiven1000_shouldReturn450() {
        final BelgianTaxCalculation testCalculation = new BelgianTaxCalculation();
        double expectedTaxes = 450;
        Assertions.assertThat(testCalculation.calculateTaxes(1000)).isEqualTo(expectedTaxes);
    }

}