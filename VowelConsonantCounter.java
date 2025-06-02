import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String lowerInput = input.toLowerCase();
        
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("\nAnalysis Results:");
        System.out.println("Input string: \"" + input + "\"");
        System.out.println("Total letters: " + (vowels + consonants));
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        scanner.close();
    }
}