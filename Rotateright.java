public class Rotateright {

    public static void rightRotate(int[] arr, int k) 
    {
        int n = arr.length;
        
        k = k % n; // Ensure k is within the range of array length
        System.out.println(k);
        reverse(arr, 0, n - 1);      // Step 1: Reverse the entire array
        reverse(arr, 0, k - 1);      // Step 2: Reverse the first k elements
        reverse(arr, k, n - 1);      // Step 3: Reverse the last (n-k) elements
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3; // Number of right rotations

        rightRotate(arr, k);

        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
