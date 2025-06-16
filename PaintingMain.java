import java.util.Scanner;

public class PaintingMain {
    public static void main(String[] args) {
        Painting painting = new Painting();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Painting Title: ");
        painting.title = input.next();
        System.out.println("Enter Artist Name: ");
        painting.artist = input.next();
        System.out.println("Enter Year: ");
        painting.year = input.nextInt();
        System.out.println("Enter Medium: ");
        painting.medium = input.next();
        System.out.println("Enter Dimensions: ");
        painting.dimensions = input.next();
        System.out.println("Enter Current Owner: ");
        painting.currentOwner = input.next();
        System.out.println("Enter Value: ");
        painting.value = input.nextDouble();

        System.out.println("\nPainting Details:");
        System.out.println("Title: " + painting.title);
        System.out.println("Artist: " + painting.artist);
        System.out.println("Year: " + painting.year);
        System.out.println("Medium: " + painting.medium);
        System.out.println("Dimensions: " + painting.dimensions);
        System.out.println("Current Owner: " + painting.currentOwner);
        System.out.println("Value: $" + painting.value);
    }
}
