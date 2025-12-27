package collectionframework;

import java.util.*;

public class generic {

	public static void main(String[] args) {
		
		// Creating an ArrayList
        // Declaring object of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Adding elements to the ArrayList
        // Custom input elements
        al.add("Sachin");
        al.add("Rahul");
 
        // Now compiler does not allow this operation
        al.add(10);
 
        String s1 = al.get(0);
        String s2 = al.get(1);
        String s3 = al.get(2);
    }

	

}
