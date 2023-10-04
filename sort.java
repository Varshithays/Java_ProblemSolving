import java.util.*;
import java.io.*;

class Main {

  public static String StringChallenge(String str1, String str2) {
    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);
    
    str1=new String(chars1).contains(new String(chars2)) ? "true" : "false";
    return str1;
  }

  public static void main(String[] args) {  
    Scanner s = new Scanner(System.in);
    String str1 = s.nextLine();
    String str2 = s.nextLine();
    String result = StringChallenge(str1, str2);
    System.out.print(result);
  }
}
