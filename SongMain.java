import java.util.Scanner;

public class SongMain {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Song Title: ");
        song.title = input.next();
        System.out.println("Enter Artist Name: ");
        song.artist = input.next();
        System.out.println("Enter Album Name: ");
        song.album = input.next();
        System.out.println("Enter Duration (in minutes): ");
        song.duration = input.nextDouble();
        System.out.println("Enter Release Date: ");
        song.releaseDate = input.next();
        System.out.println("Enter Genre: ");
        song.genre = input.next();
        System.out.println("Enter Songwriter Name: ");
        song.songWriter = input.next();

        System.out.println("\nSong Details:");
        System.out.println("Title: " + song.title);
        System.out.println("Artist: " + song.artist);
        System.out.println("Album: " + song.album);
        System.out.println("Duration: " + song.duration + " minutes");
        System.out.println("Release Date: " + song.releaseDate);
        System.out.println("Genre: " + song.genre);
        System.out.println("Songwriter: " + song.songWriter);
    }
}
