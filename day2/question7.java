
//write a program to product of a digit 
package day2;
import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int product = 1;
        int n = Math.abs(number);

        if (n == 0) {
            product = 0;
        } else {
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
        }

        System.out.println("Product of digits: " + product);
        scanner.close();
    }
}
