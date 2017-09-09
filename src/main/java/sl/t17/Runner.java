package sl.t17;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {

        Student student=new Student("facult_1","name_1",1,"asd");
        System.out.println(student);

        String file="demo.data";
        Serializator sz=new Serializator();
        boolean b=sz.serialization(student,file);
        System.out.println(b);

        Student.faculty="facult_2";
        System.out.println(student);

        Student result=null;

        try {
            result=sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
