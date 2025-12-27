import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count =0;
        int no = in.nextInt();
        while(no>0)
        {
            no= no/10;
            count++;
        }
        System.out.println(count);
    }
}
