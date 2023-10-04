public class Practice {
    public static void print2largest(int arr[], int arr_size) {
        int firstMax = Integer.MIN_VALUE;
        int maxindex=0;
        // first i am finding maximum elemnt in whole array
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
                maxindex=i;
            }
        }

        
        int temp = arr[0];
        arr[0]=firstMax;
        arr[maxindex]=temp;
        
        
       //modified array would be like 35,12,1,10,34,2
        int secondmax=0;
          //so now run the for loop from 1 to n find max that will be second largest
        for (int i = 1; i < arr_size; i++) {
            if (arr[i] >secondmax) {
                secondmax=  arr[i];
                
            }
        }
        System.out.println("The second largest element is: " + secondmax);
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34,2};
        int n = arr.length;
        print2largest(arr, n);
    }
}
