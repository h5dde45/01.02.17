package va.t4.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcMain {
    public static void main(String[] args)  {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("> ");
                String expr = reader.readLine();
                System.out.println(">> " + new CalculatorImpl().calculate(expr));
            }
        } catch (IOException | EvaluationException e) {
            System.err.println(e.getMessage());
        }

//        Calculator calculator=new CalculatorImpl();
//        try {
//            calculator.calculate(null);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }finally {
//            System.out.println("finally");
//        }

    }
}
