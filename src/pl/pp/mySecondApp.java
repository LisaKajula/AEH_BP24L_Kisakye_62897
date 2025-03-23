import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        // Task 1: Create an integer variable x, assign the value 10 to it
        int x = 10;

        // Calculate the double of x and the value of x squared
        int doubleX = x * 2;   // Double of x
        int squaredX = x * x;  // x squared

        // Display all three values on the console
        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleX);
        System.out.println("x squared = " + squaredX);

        // Task 2: Ask for the user's age and convert it to seconds
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();

        // Convert the age to seconds (assuming 365 days in a year)
        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;

        // Display the age in seconds
        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}

