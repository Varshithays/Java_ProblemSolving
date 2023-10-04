import java.math.BigInteger;
import java.util.Scanner;

public class FactBigInteger{
    public static BigInteger fact(int n) {
        if (n < 0) {
            return BigInteger.valueOf(-1); // Handle invalid input (negative values) as needed.
        }

        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1); // Base case: 0! and 1! = 1
        }

        BigInteger result = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter an integer to compute factorial (enter 0 to exit): ");
            n = scanner.nextInt();

            if (n == 0) {
                break;
            }

            BigInteger factorial = fact(n);

            if (factorial.equals(BigInteger.valueOf(-1))) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            } else {
                System.out.println(factorial);
            }
        }

        scanner.close();
    }
}
