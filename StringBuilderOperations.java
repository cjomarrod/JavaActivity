import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
       
        do {
            System.out.print("Enter a string (minimum 10 characters): ");
            input = scanner.nextLine();
            if (input.length() < 10) {
                System.out.println("Error: String must be at least 10 characters long. Please try again.");
            }
        } while (input.length() < 10);
    
        StringBuilder sb = new StringBuilder(input);
  
        System.out.println("\n1. Length: " + sb.length());
        
        System.out.println("2. First character: " + sb.charAt(0));
        
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));
       
        int firstA = sb.indexOf("a");
        System.out.println("4. First 'a' at index: " + (firstA != -1 ? firstA : "Not found"));

        if (sb.length() > 6) {
            System.out.println("5. Substring (3-6): " + sb.substring(3, 6));
        } else {
            System.out.println("5. Substring (3-6): String too short");
        }
        
        sb.append("123");
        System.out.println("6. After appending '123': " + sb);

        sb.insert(4, "xyz");
        System.out.println("7. After inserting 'xyz' at 4: " + sb);

        sb.delete(2, 4);
        System.out.println("8. After deleting (2-4): " + sb);
        
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("9. After deleting char at 8: " + sb);
        } else {
            System.out.println("9. String too short to delete index 8");
        }
        
        sb.reverse();
        System.out.println("10. Reversed string: " + sb);
        
        scanner.close();
    }
}