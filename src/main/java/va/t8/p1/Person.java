package va.t8.p1;

public class Person {
    private int id;
    private String name;
    public String fname;

    public Person() {

    }

    private Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {

        this.id = id;
        this.name = name;
    }

    private void show(){
        System.out.println("+++");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
