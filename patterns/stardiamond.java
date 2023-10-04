package Java_ProblemSolving.patterns;

public class stardiamond {
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j < i; j++) {
                System.out.print("*");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("");
            }
            System.out.println();
        }
  
        // outer loop to handle lower part
      
    }
  
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
