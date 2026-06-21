//write a program to write function to find maximum of two numbers.
public class question42 {
    public static int findMaximum(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int result = findMaximum(5, 10);
        System.out.println("Maximum: " + result);
    }
}
