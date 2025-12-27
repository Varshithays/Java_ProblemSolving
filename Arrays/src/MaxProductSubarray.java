import java.util.*;
public class MaxProductSubarray {

    public static void maxproduct(int[] array,int n){

        int max= Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<n;i++){
            product = product * array[i];
            if(max<product)
                max=product;
            if(product<1)
                product=1;
        }
        System.out.println(max);
    }
    public static void main(String... args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++){
           array[i] = in.nextInt();
        }
        maxproduct(array,n);

    }
}
