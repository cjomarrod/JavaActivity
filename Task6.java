import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        } else {
            int max = (a > b) ? a : b;
            max = (c > max) ? c : max;
            System.out.println("The largest number is: " + max);
        }

        input.close();
    }
}