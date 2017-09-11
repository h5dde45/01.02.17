package sl.t22;

public class RefString {
    public static void main(String[] args) {
        String s=new String("Message");
        System.out.println(s);
        changeString(s);
        System.out.println(s);
        System.out.println("-----------------");


        StringBuffer sb=new StringBuffer("New message");
        System.out.println(sb);
        changeStringBuff(sb);
        System.out.println(sb);
        System.out.println("-----------------");

        String s2="24";
        int i = Integer.valueOf(s2);
        double v = Double.parseDouble(s2);
        byte b = Byte.parseByte(s2);
        System.out.println(b);

        String s3="asd";
        String s4="asd";
        String s5=new String("asd");
        String s6=new String(s3);

        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3==s6);
        System.out.println(s5==s6);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));

    }
    public static void changeString(String s){
        s=s.concat("***")+"123";
        System.out.println(s+"==========");
    }
    public static void changeStringBuff(StringBuffer sb){
        sb.append("+++");
    }
}
