package sl.t24;

public class Main {
    public static void main(String[] args) {
        String s="100";

        try {
            int v1=Integer.parseInt(s);
            int v2=Integer.valueOf(s);
            int v3=new Integer(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int v4=200;

        String s1=Integer.toString(v4);
        String s2=String.valueOf(v4);
        String s3=v4+"";


    }
}
