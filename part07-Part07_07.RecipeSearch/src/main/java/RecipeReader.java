import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecipeReader {
    private Recipe currentRecipe;
    private int lineCounter;
    private ArrayList<Recipe> recipes;

    public RecipeReader(String fileName) {
        recipes = new ArrayList<Recipe>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isEmpty() || line.equals("")) {
                    lineCounter = 0;
                } else if (lineCounter == 0) {
                    int recipeTime = Integer.valueOf(scanner.nextLine());
                    lineCounter ++;
                    currentRecipe = new Recipe(line, recipeTime);
                    recipes.add(currentRecipe);
                } else {
                    currentRecipe.addIngredients(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findRecipeByName(String searchedWord) {
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipeWithinCookingTime(int maxCookingTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipeBasedOnIngredients(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.searchIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
