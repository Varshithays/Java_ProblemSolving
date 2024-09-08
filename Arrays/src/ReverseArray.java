import java.util.Arrays;

class ReverseArray {

    public static void reversewithNewarray(int[] array,int n){
        //Reverse the given array different approaches

        //FIRST APPROACH WITH NEW ARRAY
        int[] newArray = new int[n];
        for(int i= n-1,j=0;i>=0;i--,j++){
            newArray[j]=array[i];
        }
        //Space complexity: n+n =2n
        //Time Complexity : n depend on length of array
       // System.out.println(Arrays.toString(newArray));

    }
    public static void reversewithSwapping(int[] array,int n){
        //INPLACE
        for(int i=0;i<n/2;i++){
            int temp=array[i];

            array[i]=array[n-(i+1)];
            array[n-(i+1)]=temp;

        }
        //Space Complexity :n+1 = 2n
        //Time Complexity: n/2
       // System.out.println(Arrays.toString(array));
    }
    public static void reversewithFrequency(int[] array, int n, int f) {

        //REVERSE array with given frequency
        for (int i = 0; i < n; i = i + f) {
            int start = i;
            int end = Math.min(i + f - 1, n - 1);//to vaoid array out of excetpitoion
            while (start < end) {
                int temp = array[start];
                array[start++] = array[end];
                array[end--] = temp;

            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String... args){
        int[] array = {2,3,4,5,1,6,7,8,12,14,17};
        int n= array.length;
        int f =3;
        //reversewithNewarray(array,n);
        //reversewithSwapping(array,n);
        reversewithFrequency(array,n,f);

    }
}
