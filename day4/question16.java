//write a program to print armstrong numbers in a range.
package day4;
import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers in the range " + lower + " to " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }
}

