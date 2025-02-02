package dip.lab2.student.solution1;

// An useful import if you need it.
import dip.lab2.*;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class. 3. Pass one of your
 * calculator instances to the high-level class and check the results. 4. Now
 * switch to a different calculator instance and pass that to the high-level
 * class. Did it work? Are the low-level instances interchangeable? The DIP
 * requires this.
 *
 * @author your name goes here
 */
public class Startup {

    public static void main(String[] args) {

        //This is the Food Service Calculator
        TipCalculatorStrategy cal = new FoodServiceTipCalculator(
                FoodServiceTipCalculator.ServiceQuality.GOOD, 50.00);
        //This is the Baggage Service Calculator
        TipCalculatorStrategy cal2 = new BaggageServiceTipCalculator(
                BaggageServiceTipCalculator.ServiceQuality.FAIR, 5);
        //This gives you the output for the food service tip calculator
        TipService service = new TipService(cal);
        double tip = service.getTheTip();
        System.out.println("Tip given is: " + tip);
        //THis gives you the output for the baggage service tip calculator
        TipService service2 = new TipService(cal2);
        double tip2 = service2.getTheTip();
        System.out.println("Tip given is: " + tip2);

    }
}
