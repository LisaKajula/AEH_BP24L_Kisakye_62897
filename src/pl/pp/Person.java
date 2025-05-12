package pl.pp;

public class Person {
    String name;
    int age;
    String address;
    int year_of_birth;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old.");
    }

    public void growOld(int years) {
        age += years;
    }

    public void beYounger() {
        age--;
    }
}
