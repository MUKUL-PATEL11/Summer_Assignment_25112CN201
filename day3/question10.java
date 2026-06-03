//write a program to print prime number in a range
package day3;
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
