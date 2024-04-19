public class PascalsTriangle {
    public static void main(String[] args) {
        // Loop to print the first 9 lines of Pascal's Triangle (lines 0 to 8)
        for (int n = 0; n < 9; n++) {
            printPascalsTriangleLine(n);
        }
    }

    // Prints a single line of Pascal's Triangle
    public static void printPascalsTriangleLine(int n) {
        // Print each element in the line
        for (int k = 0; k <= n; k++) {
            System.out.print(binomialCoefficient(n, k) + " ");
        }
        // Move to the next line after printing all elements
        System.out.println();
    }

    // Calculates binomial coefficient (n choose k) using an efficient algorithm
    public static long binomialCoefficient(int n, int k) {
        // Variable to hold the result of the binomial coefficient
        long result = 1;
        // Optimization: use the symmetric property of binomial coefficients
        if (k > n - k) {
            k = n - k;
        }
        // Calculate the result of (n choose k) without large intermediate values
        for (int i = 0; i < k; ++i) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
