package pa.t8;

import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {

        try (Scanner scanner=new Scanner(System.in);){
            Calculator calculator=new Calculator();
            String exit="no";
            while (!exit.equals("yes")){
                System.out.print("Enter first arg: ");
                int first=scanner.nextInt();
                System.out.println();
                System.out.print("Enter second arg: ");
                int second=scanner.nextInt();
                calculator.add(first,second);
                System.out.println("\nResult: "+calculator.getResult());
                calculator.cteanResult();
                System.out.println("Exit yes/no: ");
                exit=scanner.next();
            }

        }
    }
}
