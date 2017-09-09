package sl.t15;

import java.util.Properties;

public class StringD {
    public static void main(String[] args) {

        String str="0123456789string12345string";
        System.out.println(str);
        System.out.println("+++++++++++++++++++++");

        System.out.println(str.substring(10));
        System.out.println(str.substring(10,16));
        System.out.println(str.indexOf("st"));
        System.out.println(str.lastIndexOf("tr"));
        System.out.println("--------------------");

        Properties p=System.getProperties();
        System.out.println(p);
        System.out.println("--------------------");

        String[] strings=p.toString().split(",");
        for(String s:strings){
            if(s.contains("version")||s.contains("os")){
                System.out.println(s);
            }
        }
        System.out.println("--------------------");

    }
}
