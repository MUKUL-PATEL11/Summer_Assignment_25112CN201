//write a program to recursive sum of digit.
package day7;
import java.util.Scanner;
public class question27 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}
