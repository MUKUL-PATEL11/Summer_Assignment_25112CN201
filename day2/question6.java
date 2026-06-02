//write a program to reverse a number .
package day2;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int number= sc.nextInt();
        int reverse =0;
        while (number !=0){
            int digit = number %10;
            reverse = reverse *10 + digit;
            number /=10;
        }
        System.out.println("Reversed number: " + reverse);
    }

    
}
