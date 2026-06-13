//write a program to print half pyramid pattern.
package day8;
import java.util.Scanner;
public class question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the half pyramid: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
