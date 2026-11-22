import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int recipeTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int recipeTime) {
        this.recipeName = recipeName;
        this.recipeTime = recipeTime;
        ingredients = new ArrayList<String>();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getRecipeTime() {
        return recipeTime;
    }

    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    public boolean searchIngredient(String ingredientName) {
        for (String ingredient : ingredients) {
            if (ingredient.equals(ingredientName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return recipeName + ", " + "cooking time: " + recipeTime;
    }
}
