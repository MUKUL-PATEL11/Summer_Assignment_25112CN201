//write a program to convert binary to decimal.
package day6;
import java.util.Scanner;
public class question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal representation: " + decimal);
        scanner.close();
    }
}

