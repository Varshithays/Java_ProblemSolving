//FIBONACCI SERIES
import java.util.*;
class fibonacci {

	// Function to print the fibonacci series
	static int fib(int n)
	{
		// Base Case
		int f[]=new int[n+2];
        int i;
        f[0]=0;
        if(n>0)
        {
            f[1]=1;

            for(i=2;i<=n;i++)
            {
                f[i]=f[i-1]+f[i-2];
            }
        }
        
      
        return f[n];
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given Number N
        Scanner in =new Scanner(System.in);
        System.out.println("Enter how many fib series u want??");
		int N = in.nextInt();

		// Print the first N numbers
		for (int i = 0; i < N; i++) 
        {

			System.out.print(fib(i) + " ");
		}
	}
}
