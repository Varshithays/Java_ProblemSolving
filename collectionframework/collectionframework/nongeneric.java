package collectionframework;

import java.util.ArrayList;

public class nongeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an ArrayList
        // Declaring object without any type specified
        ArrayList al = new ArrayList();
 
        // Adding elements to the above object
        // Custom input elements
        al.add("Sachin");
        al.add("Rahul");
 
        // Compiler will allows this operation
        al.add(10);
 
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
 
        // Try block to check for exceptions
        try {
 
            // Causes Runtime Exception
            String s3 = (String)al.get(2);
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
 
            // Display the exception
            System.out.println("Exception: " + e);
        }
    }
	}


