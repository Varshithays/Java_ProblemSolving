public class Reversesubstring{
    public static void reverseSubstring(int[] arr, int start, int end) {
        int n = arr.length;
        
        if (start < 0 || end >= n || start >= end) {
            System.out.println("Invalid input or empty substring.");
            return;
        }
        
        while (start < end) {
            // Swap elements without using a temporary variable
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5,6,7,8};
        int start = 2; // Start index of the substring
        int end = 5;   // End index of the substring

        reverseSubstring(arr, start, end);

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
