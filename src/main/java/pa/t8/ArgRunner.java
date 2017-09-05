package pa.t8;

public class ArgRunner {
    public static void main(String[] args) {
        System.out.println("Calculate..");
        if(args.length==2){
            int first=Integer.parseInt(args[0]);
            int second=Integer.parseInt(args[1]);

            Calculator calculate=new Calculator();
            calculate.add(first,second);
            System.out.println("Sum: "+calculate.getResult());
        }else {
            System.out.println("Enter two parameters..");
        }
    }
}
