package sl.t3;

public class SbfSbd {
    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer();
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        sbf=new StringBuffer(20);
        sbf.append("Java");
        System.out.println(sbf);
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        sbf.append(" is programming language.");
        System.out.println(sbf);
        System.out.println(sbf.length());
        System.out.println(sbf.capacity());
        System.out.println("****************");

        System.out.println(sbf);
        StringBuffer sbf2=new StringBuffer(48);
        sbf2.append("Java is programming language.");
        System.out.println(sbf2);
        System.out.println(sbf.equals(sbf2));
        System.out.println(sbf.hashCode()==sbf2.hashCode());
        System.out.println(sbf.toString().contentEquals(sbf2));
        System.out.println("===================");

        StringBuilder a=new StringBuilder("asd");
        StringBuilder b=a.append("asd");
        b=b.append("f").append("g");
        System.out.println(a);
        System.out.println(b);


    }
}
