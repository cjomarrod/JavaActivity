import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        scanner.close();
        
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);
        
        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + difference);
        System.out.println("Multiplication result: " + product);
        System.out.println("Division result: " + quotient);
    }
    
        public static double add(double a, double b) {
        return a + b;
    }
    
        public static double subtract(double a, double b) {
        return a - b;
    }
    
        public static double multiply(double a, double b) {
        return a * b;
    }
    
        public static double divide(double a, double b) {
        return a / b;
    }
}