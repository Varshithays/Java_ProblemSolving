public class Reverseinplace {

    public static void reverse(int[] arr,int n){
        n=arr.length;
        int j=n-1;
        int i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
            for(i=0;i<n;i++){
                System.out.println(arr[i]);
            }

        
    }
    public static void main(String[] args){
        int arr[] = {12, 35, 1, 10, 34, 1};
            int n = arr.length;
            reverse(arr, n);
    }
}
