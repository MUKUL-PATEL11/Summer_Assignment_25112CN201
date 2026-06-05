//write a program to print factors of a number.
package day5;
import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its factors: ");
        int n = scanner.nextInt();

        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
