package Task131;

class Afrltada {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afrltada = " + java.util.Arrays.toString(ingredients) + " ⬆ \n");
    }
}

class Caldereta extends Afrltada {
    @Override
    public void showIngredients() {
        String[] ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Siling Labwyo",
            "Cheese"
        };
        System.out.println("Caldereta = " + java.util.Arrays.toString(ingredients) + " ⬆ \n");
    }
}

class Carbonara extends Afrltada {
    @Override
    public void showIngredients() {
        String[] ingredients = {"Spaghetti", "Eggs", "Cheese", "Bacon", "Black Pepper"};
        System.out.println("Carbonara = " + java.util.Arrays.toString(ingredients) + " ⬆ \n");
    }
}

class Mechado extends Afrltada {
    @Override
    public void showIngredients() {
        String[] ingredients = {"Beef", "Tomato Sauce", "Potatoes", "Carrots", "Bay Leaves"};
        System.out.println("Mechado = " + java.util.Arrays.toString(ingredients) + " ⬆ \n");
    }
}

public class Task131 {
    public static void main(String[] args) {

        Afrltada meal1 = new Afrltada();
        Afrltada meal2 = new Carbonara();
        Afrltada meal3 = new Mechado();
        Afrltada meal4 = new Caldereta();
        

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}