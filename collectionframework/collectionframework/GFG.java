package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class 1
//A class to represent a Student
class Student2 {

 // Attributes of a student
 int rollno;
 String name, address;

 // Constructor
 public Student2(int rollno, String name, String address)
 {

     // This keyword refers to current instance itself
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 // Method of Student class
 // To print student details in main()
 public String toString()
 {

     // Returning attributes of Student
     return this.rollno + " " + this.name + " "
         + this.address;
 }
}

//Class 2
//Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student2> {

 // Method
 // Sorting in ascending order of roll number
 public int compare(Student2 a, Student2 b)
 {

     return a.rollno - b.rollno;
 }
}

//Class 3
//Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student2> {

 // Method
 // Sorting in ascending order of name
 public int compare(Student2 a, Student2 b)
 {

     return a.name.compareTo(b.name);
 }
}

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty ArrayList of Student type
        ArrayList<Student2> ar = new ArrayList<Student2>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Student2(111, "Mayank", "london"));
        ar.add(new Student2(131, "Anshul", "nyc"));
        ar.add(new Student2(121, "Solanki", "jaipur"));
        ar.add(new Student2(101, "Aggarwal", "Hongkong"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());
 
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());
 
        // Display message on console for better readability
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
	}

}
