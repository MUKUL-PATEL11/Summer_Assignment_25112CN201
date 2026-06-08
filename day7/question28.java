//write a program to recursive reverse number.
package day7;
import java.util.Scanner;
public class question28 {
    public static int reverseNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + reverseNumber(n / 10) * 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Reverse of " + number + " is: " + reverseNumber(number));
    }
}
