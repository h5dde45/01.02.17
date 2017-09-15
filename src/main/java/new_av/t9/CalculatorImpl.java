package new_av.t9;

public class CalculatorImpl implements Calculator {
    @Override
    public double culculate(String expression) {
       return Double.parseDouble(expression);
    }
}
