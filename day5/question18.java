//write a program to check strong number .
package day5;
import java.util.Scanner;
public class question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = scanner.nextInt();
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            n /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }
    }
}
