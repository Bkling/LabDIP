package dip.lab2.student.solution1;

public interface TipCalculatorStrategy {
    //This is the static enum for the serivce quality of both baggage and food service
    public static enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    //This is the abstract method that the calculators have to override
    public abstract double getTip();
}
