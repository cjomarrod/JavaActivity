import java.util.Scanner;

public class SumofInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers to sum (any non-integer to stop):");
        
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        
        System.out.println("Total: " + sum);
    }
}