import java.util.Scanner;

public class MoiveMain {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Movie Title: ");
        movie.title = input.next();
        System.out.println("Enter Director: ");
        movie.director = input.next();
        System.out.println("Enter Release Date: ");
        movie.releaseDate = input.next();
        System.out.println("Enter Genre: ");
        movie.genre = input.next();
        System.out.println("Enter Runtime (in minutes): ");
        movie.runtime = input.nextInt();
        System.out.println("Enter Budget: ");
        movie.budget = input.nextDouble();
        System.out.println("Enter Box Office Collection: ");
        movie.boxOffice = input.nextDouble();

        System.out.println("\nMovie Details:");
        System.out.println("Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Release Date: " + movie.releaseDate);
        System.out.println("Genre: " + movie.genre);
        System.out.println("Runtime: " + movie.runtime + " minutes");
        System.out.println("Budget: " + movie.budget);
        System.out.println("Box Office: " + movie.boxOffice);
    }
}
