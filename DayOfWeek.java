import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number between 1 and 7: ");
        String input = scanner.nextLine();
        
        try {
        
            int dayNumber = Integer.parseInt(input);
            
          
            String day;
            switch (dayNumber) {
                case 1: day = "Monday"; break;
                case 2: day = "Tuesday"; break;
                case 3: day = "Wednesday"; break;
                case 4: day = "Thursday"; break;
                case 5: day = "Friday"; break;
                case 6: day = "Saturday"; break;
                case 7: day = "Sunday"; break;
                default: day = "invalid input"; break;
            }
            
            System.out.println(day);
        } catch (NumberFormatException e) {
        
            System.out.println("invalid input");
        }
        
    
        scanner.close();
    }
}