import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Movie film = new Movie();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Movie Title: ");
        film.title = input.next();
        System.out.println("Enter Director: ");
        film.director = input.next();
        System.out.println("Enter Release Date: ");
        film.releaseDate = input.next();
        System.out.println("Enter Genre: ");
        film.genre = input.next();
        System.out.println("Enter Runtime (in minutes): ");
        film.runtime = input.nextInt();
        System.out.println("Enter Budget (in million dollars): ");
        film.budget = input.nextDouble();
        System.out.println("Enter Box Office Collection (in million dollars): ");
        film.boxOffice = input.nextDouble();

        System.out.println("\nMovie Details:");
        System.out.println("Title: " + film.title);
        System.out.println("Director: " + film.director);
        System.out.println("Release Date: " + film.releaseDate);
        System.out.println("Genre: " + film.genre);
        System.out.println("Runtime: " + film.runtime + " minutes");
        System.out.println("Budget: $" + film.budget + " million");
        System.out.println("Box Office: $" + film.boxOffice + " million");
    }
}
