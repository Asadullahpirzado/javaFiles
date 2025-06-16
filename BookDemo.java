public class BookDemo {
    // Book class
    static class Book {
        private String title;
        private String author;
        private int publicationYear;
        private static double lateFeeRate; // Static late fee rate for all books

        // Static initialization block to set default late fee rate
        static {
            lateFeeRate = 0.50; // Default late fee rate of $0.50 per day
        }

        // Constructor
        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        // Getters
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public int getPublicationYear() { return publicationYear; }

        // Setters
        public void setTitle(String title) { this.title = title; }
        public void setAuthor(String author) { this.author = author; }
        public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

        // Static methods for late fee rate
        public static void setLateFeeRate(double newRate) {
            if (newRate >= 0) {
                lateFeeRate = newRate;
            } else {
                System.out.println("Error: Late fee rate cannot be negative.");
            }
        }

        public static double getLateFeeRate() {
            return lateFeeRate;
        }

        // Method to calculate late fee based on number of late days
        public double calculateLateFee(int lateDays) {
            if (lateDays < 0) {
                System.out.println("Error: Late days cannot be negative.");
                return 0.0;
            }
            return lateDays * lateFeeRate;
        }

        // toString method for easy printing
        @Override
        public String toString() {
            return "Book{Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear + "}";
        }
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Display initial book information
        System.out.println("Library Management at 04:11 PM PKT, Tuesday, May 20, 2025:\n");
        System.out.println("Initial Book: " + book);
        System.out.println("Default Late Fee Rate: $" + Book.getLateFeeRate() + " per day");
        System.out.println();

        // Set a new late fee rate
        Book.setLateFeeRate(0.75);
        System.out.println("Updated Late Fee Rate: $" + Book.getLateFeeRate() + " per day");
        System.out.println();

        // Calculate late fee for the book
        int lateDays = 10;
        double lateFee = book.calculateLateFee(lateDays);
        System.out.println("Late Fee for " + book.getTitle() + " (" + lateDays + " days late): $" + lateFee);

        // Test with invalid inputs
        System.out.println("\nTesting invalid cases:");
        Book.setLateFeeRate(-0.5); // Should print error
        book.calculateLateFee(-5); // Should print error
    }
}