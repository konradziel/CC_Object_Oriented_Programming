package restaurant;

public class Chef implements Cloneable{
    private String name;
    private String cuisineType;
    private int recipesCreated;

    public Chef(String name, String cuisineType, int recipesCreated) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.recipesCreated = recipesCreated;
    }

    public int getRecipesCreated() {
        return recipesCreated;
    }

    public void setRecipesCreated(int recipesCreated) {
        this.recipesCreated = recipesCreated;
    }

    @Override
    public Chef clone() throws CloneNotSupportedException {
        return (Chef) super.clone();
    }
}
