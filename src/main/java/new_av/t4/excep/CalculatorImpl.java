package new_av.t4.excep;

import java.util.Objects;

public class CalculatorImpl implements Calculator {

    /**
     *
     * @param expression
     * @return
     * @throws NullPointerException when <code>expression</code> is null
     */
    @Override
    public double calculate(String expression) throws CheckedException {
        Objects.requireNonNull(expression,"expression is null");
        if (expression.contains("unchecked")){
           throw  new UncheckedException("expression conteince 'unchecked'.Unsupported operator found");
        }
        if (expression.contains("checked")){
           throw  new CheckedException("expression conteince 'checked'.Unsupported operator found");
        }
        return 0;
    }


}
