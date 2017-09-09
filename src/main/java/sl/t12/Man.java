package sl.t12;

public class Man implements Cloneable{
    private int id =111;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Man clone() throws CloneNotSupportedException {
        return (Man) super.clone();
    }
}
