    import static java.lang.Math.*;
    
    public class Task9 {
    

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) a / b; 
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(15, 3));
        System.out.println("Subtraction: " + subtract(20, 7));
        System.out.println("Multiplication: " + multiply(5, 6));
        System.out.println("Division: " + divide(25, 4));
    }
}

