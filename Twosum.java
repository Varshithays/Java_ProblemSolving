import java.io.*;

class Twosum {

    // Function to find and print pair
    public int[] chkPair(int A[], int x) {
        int n = A.length;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = (i + 1); j < n; j++) {
                if (A[i] + A[j] == x) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int A[] = { 0, 5, 4, -3, 1 };
        int x = 2;

        Twosum twosum = new Twosum(); // Create an instance of Twosum
      twosum.chkPair(A, x); // Call the chkPair method

        
    }
}
