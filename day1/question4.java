package day1;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        while(n != 0){
            n /= 10;
            b++;
        }
        System.out.println("The number of digits in given number is : "+ b);
        sc.close();
    }
    
}
