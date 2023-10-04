import java.util.*;
class perfect {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i=1;
        int sum=0;
        while(i<=num/2){
        if(num % i ==0)
            sum=sum+i;
            i++;
        }
        if(sum==num){
            System.out.println("Perfect number");
        }else{
             System.out.println("Not a Perfect number");
        }
    }
    

}
