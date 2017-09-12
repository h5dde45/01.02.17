package new_av.t4.excep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcMain {
    public static void main(String[] args)  {

        try (        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            for (;;) {
                System.out.print("Enter expretion: ");
                String expr = reader.readLine();
                System.out.println(" >>> "+  new CalculatorImpl().calculate(expr));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
//            e.printStackTrace();
        }

//        finally {
//            System.out.println("finally");
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
