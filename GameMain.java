import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Game Title: ");
        game.title = input.next();
        System.out.println("Enter Genre: ");
        game.genre = input.next();
        System.out.println("Enter Developer Name: ");
        game.developer = input.next();
        System.out.println("Enter Platform: ");
        game.platform = input.next();
        System.out.println("Enter Release Date: ");
        game.releaseDate = input.next();
        System.out.println("Enter Player Count: ");
        game.playerCount = input.nextInt();
        System.out.println("Enter Age Rating: ");
        game.ageRating = input.next();

        System.out.println("\nGame Details:");
        System.out.println("Title: " + game.title);
        System.out.println("Genre: " + game.genre);
        System.out.println("Developer: " + game.developer);
        System.out.println("Platform: " + game.platform);
        System.out.println("Release Date: " + game.releaseDate);
        System.out.println("Player Count: " + game.playerCount);
        System.out.println("Age Rating: " + game.ageRating);
    }
}
