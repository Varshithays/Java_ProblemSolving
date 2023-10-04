// Java Program to demonstrate
// Brute Force Method
// to check if a number is prime
import java.util.Scanner;
class prime_2 {
	static boolean isPrime(int n)
	{
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true;
	}

	// Driver Program
	public static void main(String args[])
	{
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
		if (isPrime(N))
			System.out.println(" its a prime!");
		else
			System.out.println(" not a prime");
		
	}
}
