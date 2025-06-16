import java.util.Scanner;

public class WebsiteMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Website website = new Website();

        System.out.print("Enter Website URL: ");
        website.url = input.next();
        System.out.print("Enter Owner Name: ");
        website.owner = input.next();
        System.out.print("Enter Creation Date: ");
        website.creationDate = input.next();
        System.out.print("Enter Number of Visitors: ");
        website.visitors = input.nextInt();
        System.out.print("Enter Page Count: ");
        website.pageCount = input.nextInt();
        System.out.print("Enter Server Location: ");
        website.serverLocation = input.next();
        System.out.print("Enter Framework Used: ");
        website.framework = input.next();

        System.out.println("\nWebsite Details:");
        System.out.println("URL: " + website.url);
        System.out.println("Owner: " + website.owner);
        System.out.println("Creation Date: " + website.creationDate);
        System.out.println("Visitors: " + website.visitors);
        System.out.println("Page Count: " + website.pageCount);
        System.out.println("Server Location: " + website.serverLocation);
        System.out.println("Framework: " + website.framework);
    }
}
