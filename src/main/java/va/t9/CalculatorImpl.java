package va.t9;

public class CalculatorImpl implements Calculator{
    @Override
    public double calculate(String expression) {

        return Double.parseDouble(expression);
//        return Double.valueOf(expression);
    }
}
