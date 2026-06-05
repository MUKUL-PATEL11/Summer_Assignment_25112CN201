//write a program to find largest prime factor.
package day5;
import java.util.Scanner;
public class question20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its largest prime factor: ");
        int n = scanner.nextInt();
        int largestPrimeFactor = -1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        if (largestPrimeFactor != -1) {
            System.out.println("The largest prime factor of " + n + " is: " + largestPrimeFactor);
        } else {
            System.out.println("The number " + n + " has no prime factors.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
