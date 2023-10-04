

public class longestsubarray {

    public static int subarray(int[] nums, int k) {
        int length=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
            //i=0to4 1,2,1=3
            //i=1to4 2,1,0,1=4
			int sum=0;
			for(int j=i;j<n;j++){
				sum+=nums[j];

				if(sum==k){
					length=Math.max(length,j-i+1);//3,4
				}
			}
		}
		return length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,0,1};
        int k = 4;
        int maxlength = subarray(nums, k);
        System.out.println("Longest subarray length is "+maxlength);
    }
}
