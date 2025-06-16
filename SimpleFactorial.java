public class SimpleFactorial {
    // Recursive method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Error: Number must be non-negative.");
            return -1; // Indicate error
        }
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }

    // Main method to test the program
    public static void main(String[] args) {
        System.out.println("Factorial Calculation at 02:55 PM PKT, Tuesday, May 20, 2025:\n");

        // Test with small numbers
        int[] numbers = {0, 3, 5};
        for (int num : numbers) {
            int result = calculateFactorial(num);
            if (result != -1) {
                System.out.println("Factorial of " + num + " is: " + result);
            }
        }
    }
}