import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine().trim();
        
        int count = text.isEmpty() ? 0 : text.split("\\s+").length;
        System.out.println("Word count: " + count);
    }
}