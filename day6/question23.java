//write a program to count set bits in a number.
package day6;
import java.util.Scanner;
public class question23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            count += n & 1; // Check if the least significant bit is 1
            n >>= 1; // Right shift to check the next bit
        }
        System.out.println("Number of set bits: " + count);
    }
}
