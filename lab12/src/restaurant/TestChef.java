package restaurant;

public class TestChef {
    public static void main(String[] args) {
        Chef chef = new Chef("Andrew", "Spanish", 6);
        Chef clonedChef = null;

        try {
            clonedChef = chef.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        chef.setRecipesCreated(10);

        System.out.println("Original chef recipes: " + chef.getRecipesCreated());
        System.out.println("Cloned chef recipes: " + clonedChef.getRecipesCreated());
    }
}
