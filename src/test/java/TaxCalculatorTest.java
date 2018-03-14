import be.reneald.sdi.TaxCalculator;
import be.reneald.sdi.calculations.AmericanTaxCalculation;
import be.reneald.sdi.calculations.TaxCalculation;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TaxCalculatorTest {
    @Mock
    private AmericanTaxCalculation testCalculation;

    @InjectMocks
    private TaxCalculator testCalculator;

    @Test
    public void calculateTaxes_shouldCallTaxCalculation() {
        when(testCalculation.calculateTaxes(100)).thenReturn(45.00);

        double actualResult = testCalculator.calculateTaxes(100);

        Assertions.assertThat(actualResult).isEqualTo(45.00);
    }

    @Test
    public void calculateTaxes_shouldCallCorrectTaxCalculation() {
        testCalculator.calculateTaxes(25000);

        Mockito.verify(testCalculation, new Times(1)).calculateTaxes(25000);
    }

}