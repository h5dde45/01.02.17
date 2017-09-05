package as.t3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Person(100 * (i + 1), 200 * (i + 1)));
        }
        process(list, (s, b) -> s+0.2*b);

        for (Person person:list){
            System.out.println(person.getSalary());
            System.out.println(person.getBonus());
            System.out.println(person.getTotal());
            System.out.println("*****************");
        }

        list.forEach(person -> System.out.println(person.getTotal()));
        System.out.println("*****************");
        list.forEach(System.out::println);
        System.out.println("*****************");

        List<Person> collect = list.stream().filter(person -> person.getTotal() > 1000).collect(Collectors.toList());

        collect.forEach(System.out::println);
        System.out.println("*****************");
        list.parallelStream().forEach(System.out::println);
    }

//    public static void process(List<Person> people,Process pr) {
//        for (Person p : people) {
//            p.setTotal(pr.calculate(p.getSalary(),p.getBonus()));
//        }
//    }

    public static void process(List<Person> people,BiFunction<Integer,Integer,Double> pr) {
        for (Person p : people) {
            p.setTotal(pr.apply(p.getSalary(),p.getBonus()));
        }
    }
}

interface Process{
    double calculate(int salary,int bonus);
}

class Person {
    private int salary;
    private int bonus;
    private double total;

    public Person(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", total=" + total +
                '}';
    }
}
