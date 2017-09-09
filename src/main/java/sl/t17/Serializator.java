package sl.t17;

import java.io.*;

public class Serializator {

    public boolean serialization(Student st,String fileName){
        boolean flag=false;
        File f=new File(fileName);
        try (
                FileOutputStream fos=new FileOutputStream(f);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                ){
            oos.writeObject(st);
            flag=true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException {
        File f=new File(fileName);
        try (
                FileInputStream fis= new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                ){
            Student st= (Student) ois.readObject();
            return st;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not deserialized");
    }


}
