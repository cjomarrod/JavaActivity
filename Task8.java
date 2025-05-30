public class Task8 {
    
    public static void main(String[] args) {
        System.out.println("Total: " + calculate(4, 5, 10));
    }

    static int calculate(int... nums) {
        int total = 0;
        for (int n : nums) {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum for " + n + ": " + sum);
            total += sum;
        }
        return total;
    }
}

