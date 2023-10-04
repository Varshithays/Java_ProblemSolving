

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] nums={23,45,6,7,8,99,88,23,45,47};
        int target=7;
        int ans=linearsearch(nums,target);
        System.out.println(ans);

    }
    //search array return index if found
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            //check for element at every index if it is a target
            int ele=arr[i];
            if(ele==target){
                return i;
            }
        }

        //this line will execute if non of the return above is not executed
        return -1;
    }
}
