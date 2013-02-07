package dip.lab2.student.solution1;

public class TipService {
    private TipCalculatorStrategy tipCalculatorStrategy;
    
    public double getTheTip() {
        return tipCalculatorStrategy.getTip();
    }
    
    public TipService(TipCalculatorStrategy tipCalculatorStrategy) {
        this.tipCalculatorStrategy = tipCalculatorStrategy;
    }

}
