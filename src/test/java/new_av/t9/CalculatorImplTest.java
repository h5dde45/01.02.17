package new_av.t9;

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
    public void test_zero() throws Exception {
        double result = calculator.culculate("0");
        assertEquals(0, result,1e-9);
    }

    @Test
    public void negative_floating_number() throws Exception {
        double result = calculator.culculate("-3453e-3");
        assertEquals(-3.453, result,1e-9);
    }

    @Test
    public void sum_numbers() throws Exception {
        double result = calculator.culculate("2.3+2");
        assertEquals(4.3, result,1e-9);
    }
}