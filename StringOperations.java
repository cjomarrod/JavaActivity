import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
  
        System.out.println("1. Length: " + input.length());
        
        System.out.println("2. Uppercase: " + input.toUpperCase());
        
        System.out.println("3. Lowercase: " + input.toLowerCase());
        
        if (!input.isEmpty()) {
            System.out.println("4. First character: " + input.charAt(0));
        } else {
            System.out.println("4. First character: (String is empty)");
        }
        
        if (!input.isEmpty()) {
            System.out.println("5. Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("5. Last character: (String is empty)");
        }
        
        if (input.length() >= 5) {
            System.out.println("6. Substring (2nd to 5th): " + input.substring(1, 5));
        } else {
            System.out.println("6. Substring (2nd to 5th): String too short (requires at least 5 characters)");
        }
        
        scanner.close();
    }
}