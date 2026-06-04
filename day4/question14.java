//write a program to find nth fibonacci term.
package day4;
import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the fibonacci term you want to find: ");
        int n = scanner.nextInt();
        long fib = findNthFibonacci(n);
        System.out.println("The " + n + "th fibonacci term is: " + fib);
    }

    public static long findNthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        long first = 0, second = 1;
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
