package pl.pp;

public class myFifthApp {

    public static void main(String[] args) {
        greetUser("Alice");
        greetUser("Bob");
        greetUser("Charlie");
    }

    // A simple method that prints a greeting
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
