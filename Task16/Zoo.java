package Task16;

public class Zoo {
    public static void main(String[] args) {
        Gorilla silverback = new Gorilla();
        
        boolean timerBeeped = true;
        boolean wasFed = silverback.feed(timerBeeped);
        System.out.println("Gorilla was fed: " + wasFed);
        
        silverback.groom();
        
        silverback.pet();
    }
}