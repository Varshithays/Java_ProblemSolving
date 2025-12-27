package collectionframework;

import java.util.*;

public class RemoveElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of HashSet<Integer>
        Collection<Integer> set1 = new HashSet<Integer>();
 
        // Populating arrset1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
 
        // print set1
        System.out.println("Initial set1 : " + set1);
         
          // remove a particular element
          set1.remove(4);
       
          // print modified set1
        System.out.println("set1 after removing 4 : " + set1);
        // Creating another object of HashSet<Integer>
        Collection<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
 
        // print set2
        System.out.println("Collection Elements to be removed : " + set2);
 
        // Removing elements from set1
        // specified in set2
        // using removeAll() method
        set1.removeAll(set2);
 
        // print arrset1
        System.out.println("set 1 after removeAll() operation : " + set1);
     // Checking the presence using contains()
        boolean result=set1.contains(5);
        System.out.println("Is 5 present in the set?:"+result);
        //Size
        System.out.println("Size of the collection:"+set1.size());
        
        System.out.println(set2);
     // Clearing the set
        set2.clear();
     // To check if collection is empty
        System.out.println(set2);
        System.out.println("Is the set empty?"+set2.isEmpty());
	}

}
