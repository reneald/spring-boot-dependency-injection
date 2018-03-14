package be.reneald.sdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;

@SpringBootApplication
//Why does this not work without @ComponentScan? Because I used @SpringBootConfiguration, not @SpringBootApplication
public class Application implements CommandLineRunner {
    private final ApplicationContext applicationContext;


    @Inject
    public Application(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        double myYearlyIncome = 23000;
        System.out.println("Your yearly income is " + taxCalculator.calculateTaxes(myYearlyIncome));
    }
}
