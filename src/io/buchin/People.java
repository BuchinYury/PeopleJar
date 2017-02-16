package io.buchin;

/**
 * Created by yuri on 10.02.17.
 */
public class People {

    private static int id = 5;

    private String name;
    private int age;
    private double salary;

    public People(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public People(){}

    protected void paySalary(){
        System.out.println("I have salary " + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
