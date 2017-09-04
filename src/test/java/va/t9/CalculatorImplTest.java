package va.t9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {

    private CalculatorImpl calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();

    }


    @Test
    public void zeroTest() throws Exception {
        double result = calculator.calculate("0");
        assertEquals(0, result, 1e-9);
    }

    @Test
    public void floating_point_test() throws Exception {
        double result = calculator.calculate("-3e3");
        assertEquals(-3000, result, 1e-9);
    }

    @Test
    public void addition_test() throws Exception {
        double result = calculator.calculate("2+2");
        assertEquals(4, result, 1e-9);
    }

    @Test
    public void complex__expression_test() throws Exception {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(-443.4, result, 1e-9);
    }

    @Test
    public void function_test() throws Exception {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        assertEquals(1, result, 1e-9);
    }
}