package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.address = "123 Main Street";
        person.year_of_birth = 1999;

        person.sayHello();
        person.growOld(10);
        person.sayHello();
        person.beYounger();
        person.sayHello();
    }
}
