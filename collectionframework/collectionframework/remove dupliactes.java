import java.util.Scanner;  
class removeduplicates {   
        
    public static void removeDuplicates(String str)   
    {   
        
        String result = new String();        
     
        for (int i = 0; i <str. length(); i++)    
        {   
             char ch = str.charAt(i);   
            if (result.indexOf(ch) < 0)   //or result.indexOf(ch)==-1
            {   
                result += ch;   
            }   
        }   
         
        System.out.println(result);  
    }   
    public static void main(String[] args)   
    {   Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        removeDuplicates(str);   
    }   
}
    

