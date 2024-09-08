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
/* Reverse an Array with different approaches 1st is with new Array and other Swapping*/
import java.util.Arrays;

public class ReverseArray {
//Reverse the given array different approaches
    public static void main(String... reverseArray){
        int[] array={2,3,4,5,1,6,7,8,0};
        int length=array.length;
//FIRST APPROACH WITH NEW ARRAY
        System.out.println(length);
        int[] newArray = new int[length];
        for(int i= length-1,j=0;i>=0;i--,j++){
            newArray[j]=array[i];
        }
        //Space complexity: n+n =2n
        //Time Complexity : n depend on length of array
        System.out.println(Arrays.toString(newArray));

        //2 SWAPPING
        for(int i=0;i<length/2;i++){
            int temp=array[i];
            System.out.println(length);
            array[i]=array[length-(i+1)];
            array[length-(i+1)]=temp;

        }
        //Space Complexity :n+1 = 2n
        //Time Complexity: n/2
        System.out.println(Arrays.toString(array));
    }

}
