package day1;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        int fact= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ; ");
        int n = sc.nextInt();
         for(int i = 1;i <= n; i++){
            fact*=i;
         }
         System.out.println("The factorial of given number is : " + fact);
         sc.close();
    }
}
