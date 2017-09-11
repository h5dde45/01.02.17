package sl.t21;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name;
        double weight;
        int height;
//        double delta;
//        String action;

        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your weight: ");
        weight=sc.nextDouble();
        System.out.print("Enter your height: ");
        height=sc.nextInt();
        System.out.println();
        System.out.println("Your name is "+name);
        System.out.println("Your weight is "+weight);
        System.out.println("Your height is "+height);


    }
}
