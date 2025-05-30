package Task16;

public class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timerBcat) {
        // put gorilla food into cage
        System.out.println("Putting gorilla food into cage");
        return timerBcat;  // Return whether timer went off
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming procedure: lather, rinse, repeat");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Warning: pet at your own risk!");
    }
}