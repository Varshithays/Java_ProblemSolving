import java.util.*;

class MatrixCom {
    public static void setZeroes(int[][] matrix, int n, int m) {
        // Create sets to store the rows and columns to be zeroed
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        // Find the rows and columns containing zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Set zeros for rows
        for (int row : zeroRows) {
            for (int j = 0; j < m; j++) {
                matrix[row][j] = 0;
            }
        }

        // Set zeros for columns
        for (int col : zeroCols) {
            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        
        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call the setZeroes method to modify the matrix
        setZeroes(matrix, n, m);

        // Print the modified matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
