import java.util.Scanner;

public class SumAverage {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers? ");
        int n = scanner.nextInt();
        
        double sum = 0;
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / n));
        
        scanner.close();
    }
}