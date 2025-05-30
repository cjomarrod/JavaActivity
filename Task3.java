public class Task3 {
   
       public static void main(String[] args) {
        String a = "Wow!";
        String b = "Wow";
        String c = "Different";
        String d = a;

        boolean b1 = a == d;        
        boolean b2 = d.equals(b + "!");  
        boolean b3 = !c.equals(a);      

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}


