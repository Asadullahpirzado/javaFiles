import java.util.Scanner;

public class SocialMediaPostMain {
    public static void main(String[] args) {
        SocialMediaPost post = new SocialMediaPost();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Author Name: ");
        post.author = input.next();
        System.out.println("Enter Post Content: ");
        post.content = input.next();
        System.out.println("Enter Timestamp: ");
        post.timestamp = input.next();
        System.out.println("Enter Number of Likes: ");
        post.likes = input.nextInt();
        System.out.println("Enter Number of Comments: ");
        post.comments = input.nextInt();
        System.out.println("Enter Number of Shares: ");
        post.shares = input.nextInt();
        System.out.println("Enter Visibility (Public/Private/Friends): ");
        post.visibility = input.next();

        System.out.println("\nPost Details:");
        System.out.println("Author: " + post.author);
        System.out.println("Content: " + post.content);
        System.out.println("Timestamp: " + post.timestamp);
        System.out.println("Likes: " + post.likes);
        System.out.println("Comments: " + post.comments);
        System.out.println("Shares: " + post.shares);
        System.out.println("Visibility: " + post.visibility);
    }
}
