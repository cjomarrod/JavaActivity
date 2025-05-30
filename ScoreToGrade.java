package ScoreToGrade;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter student's score: ");
        
 
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid number");
            return;  
        }
        
        int score = scanner.nextInt();
        
   
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100");
            return; 
        }
        

        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Output result
        System.out.println("Grade: " + grade);
        
        scanner.close();  
    }
}