 //MINI PROJECT
package javapracticeprograms;
import java.util.Scanner;


public class Random{
   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       int myNumber = (int)(Math.random()*10);
       int userNumber = 0;

       do {
           System.out.println("Guess my number(1-10) : ");
           userNumber = sc.nextInt();

           if(userNumber == myNumber) {
               System.out.println("WOW .. CORRECT NUMBER!!!");
               break;
           }
           else if(userNumber > myNumber) {
               System.out.println("your number is too large");
           }
           else {
               System.out.println("your number is too small");
           }
       } while(userNumber >= 0);

       System.out.print("My number was : ");
       System.out.println(myNumber);
    }
}
