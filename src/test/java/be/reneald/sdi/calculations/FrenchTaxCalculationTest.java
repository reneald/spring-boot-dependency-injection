package be.reneald.sdi.calculations;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrenchTaxCalculationTest {
    @Test
    public void calculateTaxes_whenGiven1000_shouldReturn480() {
        final FrenchTaxCalculation testCalculation = new FrenchTaxCalculation();
        double expectedTaxes = 480;
        Assertions.assertThat(testCalculation.calculateTaxes(1000)).isEqualTo(expectedTaxes);
    }

}