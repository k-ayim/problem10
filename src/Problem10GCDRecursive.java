import java.util.Scanner;

public class Problem10GCDRecursive {

    /**
     * Finds the Greatest Common Divisor (GCD) of two numbers using recursion.
     * 
     * @param a The first number
     * @param b The second number
     * @return The GCD of the two numbers
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Euclidean Algorithm
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);

        scanner.close();
    }
}
