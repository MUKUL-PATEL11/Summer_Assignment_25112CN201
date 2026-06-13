//write a program to print character triangle pattern.
package day8;
import java.util.Scanner;
public class question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the character triangle: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + j - 1) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

