import java.util.Scanner;

public class Analayzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine().trim();
        
        try {
            int number = Integer.parseInt(input);
            
            if (number == 0) {
                System.out.println("Zero and even");
            } else {
           
                String sign = (number > 0) ? "Positive" : "Negative";
                
        
                String parity = (number % 2 == 0) ? "even" : "odd";
                
                System.out.println(sign + " and " + parity);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}