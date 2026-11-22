import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        RecipeReader recipeReader = new RecipeReader(fileName);
        System.out.println();

        System.out.println("Commands:");
        System.out.println(
            "list - lists the recipes\nstop - stops the program"
        );

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                recipeReader.printRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                recipeReader.findRecipeByName(searchedWord);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                recipeReader.findRecipeWithinCookingTime(maxCookingTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeReader.findRecipeBasedOnIngredients(ingredient);
            }
        }
    }
}
