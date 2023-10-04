// Java program to find factorial
// of given number

// Driver Class
class Factorial {
	// Method to find factorial
	// of given number
	static int factorial(int n)
	{
		/*int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;*/
        return (n==1||n==0)?1 :n*factorial(n-1);
	}

	// main method
	public static void main(String[] args)
	{
		int num = 3;
		System.out.println("Factorial of " + num + " is "
						+ factorial(num));
	}
}
