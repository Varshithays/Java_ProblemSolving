import java.util.HashSet;
import java.util.Set;

class Matrix {
    public void setZeroes(int[][] matrix) {
       
        Set<Integer> r = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Finding rows and columns with 0 values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }

        // Now set rows to 0
        for (int i : r) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }

        // Now set columns to 0
        for (int j : c) {
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
            {1, 0, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        // Create a Solution object
        Matrix solution = new Matrix();

        // Call the setZeroes method to modify the matrix
        solution.setZeroes(matrix);

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
