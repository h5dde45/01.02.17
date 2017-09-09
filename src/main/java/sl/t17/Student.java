package sl.t17;

import java.io.Serializable;

public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password=null;
    private static final long serialVersionUID=1L;

    public Student(String nameOfFaculty, String name, int id, String password) {
        faculty=nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", faculty='" + faculty + '\'' +
                ", serialVersionUID='" + serialVersionUID + '\'' +
                '}';
    }
}
