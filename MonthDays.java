import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month number (1-12): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid number between 1 and 12");
            return;
        }
        
        int month = scanner.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Error: Month number must be between 1 and 12");
            return;
        }
        
        int days;
        switch (month) {
            case 1:  
            case 3:  
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                days = 31;
                break;
                
            case 4: 
            case 6:  
            case 9:  
            case 11: 
                days = 30;
                break;
                
            case 2:  
                days = 28;
                break;
                
            default: 
                days = -1;
                break;
        }
        
      
        System.out.println("Number of days: " + days);
        
        scanner.close();
    }
}