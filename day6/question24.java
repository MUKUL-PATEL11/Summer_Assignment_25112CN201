//write a program to find x^n without pow().
package day6;
import java.util.Scanner;
public class question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(x + "^" + n + " = " + result);
    }
}
