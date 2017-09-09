package sl.t20;

public class StringDemo {
    public static void main(String[] args) {
        String str1=" word word  ";
        System.out.println(str1);
        System.out.println(str1.trim());
        System.out.println(str1);
        System.out.println(str1.replace('r','*'));
        System.out.println(str1);
        System.out.println("++++++++++++");

        StringBuffer stringBuffer = new StringBuffer(str1);
        stringBuffer.setCharAt(1,'E');
        stringBuffer.setCharAt(0,'d');
        System.out.println(stringBuffer);

    }
}
