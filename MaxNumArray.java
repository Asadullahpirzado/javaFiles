import java.util.Scanner;

public class MaxNumArray {
    public static void main(String[] args) {
        int[] myArray = {34, 545, 34, 2, 5, 5, 46, 46};

        int mx = Integer.MIN_VALUE; // Smallest possible integer
        int mn = Integer.MAX_VALUE; // Largest possible integer

        // Single loop to find min and max
        for (int i = 0; i < myArray.length; i++) {
            mx = Math.max(mx, myArray[i]); // Get max value
            mn = Math.min(mn, myArray[i]); // Get min value
        }

        // Print results
        System.out.println("Maximum number: " + mx);
        System.out.println("Minimum number: " + mn);
    }
}
