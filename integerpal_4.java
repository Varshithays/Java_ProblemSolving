import java.util.Scanner;

public class integerpal_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(isPalindrome(str.toLowerCase()));
    }
        private static boolean isPalindrome(String original) {

            String reversed = "";
    
            int len = original.length();
    
            for (int i = len - 1; i >= 0; i--) {
    
                reversed = reversed + original.charAt(i);
            }
    
            return original.equals(reversed);
        }
    
}
