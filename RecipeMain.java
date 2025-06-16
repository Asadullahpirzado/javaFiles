import java.util.Scanner;

public class RecipeMain {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Recipe Name: ");
        recipe.name = input.next();
        System.out.println("Enter Ingredients: ");
        recipe.ingredients = input.next();
        System.out.println("Enter Preparation Time (in minutes): ");
        recipe.prepTime = input.nextInt();
        System.out.println("Enter Cooking Time (in minutes): ");
        recipe.cookTime = input.nextInt();
        System.out.println("Enter Number of Servings: ");
        recipe.servings = input.nextInt();
        System.out.println("Enter Cuisine Type: ");
        recipe.cuisine = input.next();
        System.out.println("Enter Nutrition Info: ");
        recipe.nutritionInfo = input.next();

        System.out.println("\nRecipe Details:");
        System.out.println("Name: " + recipe.name);
        System.out.println("Ingredients: " + recipe.ingredients);
        System.out.println("Preparation Time: " + recipe.prepTime + " minutes");
        System.out.println("Cooking Time: " + recipe.cookTime + " minutes");
        System.out.println("Servings: " + recipe.servings);
        System.out.println("Cuisine: " + recipe.cuisine);
        System.out.println("Nutrition Info: " + recipe.nutritionInfo);
    }
}
