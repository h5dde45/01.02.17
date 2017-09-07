package sl.t3;

public class InterAndCompare {
    public static void main(String[] args) {
        String sPool="String";
        String str=new String("String");

        StringBuffer sbf=new StringBuffer("String");
        StringBuilder sbd=new StringBuilder("String");

        System.out.println(sPool==str);
        str=str.intern();
        System.out.println(sPool==str);
        System.out.println("*************");

        System.out.println(str.equals(sbf));
        System.out.println(str.equals(sbf.toString()));
        System.out.println(sbf.equals(sbd));
        System.out.println(sbf.toString().equals(sbd.toString()));
        System.out.println(str.contentEquals(sbf));

    }
}
