import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book Title: ");
        book.title = input.next();
        System.out.println("Enter Author Name: ");
        book.author = input.next();
        System.out.println("Enter ISBN: ");
        book.isbn = input.next();
        System.out.println("Enter Genre: ");
        book.genre = input.next();
        System.out.println("Enter Publication Date: ");
        book.publicationDate = input.next();
        System.out.println("Enter Page Count: ");
        book.pageCount = input.nextInt();
        System.out.println("Enter Publisher: ");
        book.publisher = input.next();

        System.out.println("\nBook Details:");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("ISBN: " + book.isbn);
        System.out.println("Genre: " + book.genre);
        System.out.println("Publication Date: " + book.publicationDate);
        System.out.println("Page Count: " + book.pageCount);
        System.out.println("Publisher: " + book.publisher);
    }
}
