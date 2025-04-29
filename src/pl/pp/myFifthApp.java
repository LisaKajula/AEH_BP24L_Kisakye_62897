package pl.pp;

public class myFifthApp {

    // Iterative factorial method
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial method
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int N = 20;

        // Measure time for iterative method
        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(N);
        long endIterative = System.nanoTime();
        System.out.println("Iterative Result: " + resultIterative);
        System.out.println("Time taken (Iterative): " + (endIterative - startIterative) + " ns");

        // Measure time for recursive method
        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(N);
        long endRecursive = System.nanoTime();
        System.out.println("Recursive Result : " + resultRecursive);
        System.out.println("Time taken (Recursive): " + (endRecursive - startRecursive) + " ns");
    }
}
