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
}