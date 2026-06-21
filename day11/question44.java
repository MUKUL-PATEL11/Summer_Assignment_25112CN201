package day11;

import java.util.Scanner;

public class question44 {

    // 1. Iterative method (Recommended: uses less memory)
    public static long findFactorialIterative(int n) {
        if (n < 0) {
            return -1; // Indicates invalid input for factorial
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. Recursive method
    public static long findFactorialRecursive(int n) {
        if (n < 0) {
            return -1; 
        }
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * findFactorialRecursive(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Call the iterative function
        long iterativeResult = findFactorialIterative(number);
        
        if (iterativeResult == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Iterative Result: " + number + "! = " + iterativeResult);
            System.out.println("Recursive Result: " + number + "! = " + findFactorialRecursive(number));
        }
        
        scanner.close();
    }
}

    

