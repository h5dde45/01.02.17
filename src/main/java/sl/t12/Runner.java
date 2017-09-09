package sl.t12;

import java.util.ArrayList;

class Student implements Cloneable{
    private int id=99;
    private String name;
    private int age;
    private ArrayList<Byte> markList=new ArrayList<>();

    public ArrayList<Byte> getMarkList() {
        return markList;
    }

    @Override
    protected Student clone()  {
        Student copy = null;

        try {
            copy = (Student) super.clone();
            copy.markList=(ArrayList<Byte>) markList.clone();;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return copy;
    }
}

public class Runner {
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st);

        Student stc=st.clone();
        System.out.println(stc);

        System.out.println(st.getMarkList()==stc.getMarkList());
        System.out.println(st.getMarkList().equals(stc.getMarkList()));
    }
}
