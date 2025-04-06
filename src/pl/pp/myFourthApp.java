import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainChoice;

        while (true) {
            // Main Menu
            System.out.println("\nMain Menu:");
            System.out.println("1. Sum of Squares");
            System.out.println("2. Simple Calculator");
            System.out.println("q. Quit");
            System.out.print("Enter your choice: ");
            mainChoice = scanner.next().toLowerCase();

            if (mainChoice.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (mainChoice.equals("1")) {
                // Sum of Squares functionality
                while (true) {
                    System.out.print("Enter lower and upper integer limits: ");
                    int lower = scanner.nextInt();
                    int upper = scanner.nextInt();

                    if (upper <= lower) {
                        System.out.println("Done with Sum of Squares.");
                        break;
                    }

                    int total = 0;
                    for (int i = lower; i <= upper; i++) {
                        total += i * i;
                    }
                    System.out.printf("The sums of the squares from %d to %d is %d%n", lower * lower, upper * upper, total);
                }
            } else if (mainChoice.equals("2")) {
                // Calculator functionality
                String choice;

                do {
                    System.out.println("\nSimple Calculator Menu:");
                    System.out.println("a) Add");
                    System.out.println("b) Subtract");
                    System.out.println("c) Multiply");
                    System.out.println("d) Divide");
                    System.out.println("bq) Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    choice = scanner.next().toLowerCase();

                    if (choice.equals("bq")) {
                        break;
                    }

                    if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d")) {
                        System.out.println("Invalid option. Try again.");
                        continue;
                    }

                    System.out.print("Enter first number: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("That's not a number. Try again: ");
                        scanner.next();
                    }
                    double num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("That's not a number. Try again: ");
                        scanner.next();
                    }
                    double num2 = scanner.nextDouble();

                    switch (choice) {
                        case "a":
                            System.out.println("Result: " + (num1 + num2));
                            break;
                        case "b":
                            System.out.println("Result: " + (num1 - num2));
                            break;
                        case "c":
                            System.out.println("Result: " + (num1 * num2));
                            break;
                        case "d":
                            if (num2 == 0) {
                                System.out.println("Error: Cannot divide by zero.");
                            } else {
                                System.out.println("Result: " + (num1 / num2));
                            }
                            break;
                    }
                } while (true);
            } else {
                System.out.println("Invalid menu choice. Try again.");
            }
        }

        scanner.close();
    }
}
