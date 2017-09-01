package va.t4.exception;

import java.util.Objects;

public class CalculatorImpl implements Calculator {

    /**
     * @param expression
     * @return
     * @throws NullPointerException when <code>expression</code> is null
     */
    @Override
    public double calculate(String expression) throws EvaluationException {
        Objects.requireNonNull(expression,"expression is null");
//        if (expression == null) {
//            throw new NullPointerException("expression is null");
//        }
        if(expression.contains("!")){
            throw new EvaluationException("found not support the operator");
        }
        foo(expression);
        return 0;
    }

    private void foo(String expression) {
        bar(expression);
    }

    private void bar(String expression) {
        expression.toString();
    }
}
