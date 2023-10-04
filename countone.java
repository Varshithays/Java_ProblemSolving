public class countone {
    public static int count(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int maxcount=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxcount=1;
            }else if(arr[i]==max)
            {
                maxcount++;
            }
        }
        int count=n-maxcount;
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {-3, -2, 2, 4, 5, 6,9, 8, 8};
        int result = count(arr);
        System.out.println(result); // Output: 4
    }
}
