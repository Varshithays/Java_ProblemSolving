//prinyt repeated characters
import java.util.Arrays;

public class printduplicates {
     public static void printDuplicates(String str)
    {
        int len = str.length();
 
        // Sorting the string
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
 
        // Loop through the sorted string to find duplicates
        for (int i = 0; i < len; i++) {
            int count = 1;
 
            // Counting the occurrences of each character
            while (i < len - 1
                   && sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }
 
            // Printing the duplicate character and its
            // count
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        }
    }
 
    public static void main(String[] args)
    {
        String str = "aaabbcdddds";
        printDuplicates(str);
    }
    /*public static void main(String argu[]) {
       String str = "beautiful beach";
       char[] carray = str.toCharArray();
       System.out.println("The string is:" + str);
       System.out.print("Duplicate Characters in above string are: ");
       for (int i = 0; i < str.length(); i++) {
          for (int j = i + 1; j < str.length(); j++) {
             if (carray[i] == carray[j]) {
                System.out.print(carray[j] + " ");
                break;
             }
          }
       }
    }*/
 }
