package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a list of integers
        List<Integer> numbers = new ArrayList<>();
 
        // add some integers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        System.out.println("Before updation"+numbers);
        System.out.println(numbers.get(2));
     // Setting (updating) element at 1st index
        // using set() method
        numbers.set(1, 5);
        	System.out.println("After updation"+numbers);
        // use indexOf() to find the first occurrence of an
        // element in the list
        int index = numbers.indexOf(3);
        System.out.println(
            "The first occurrence of 2 is at index "
            + index);
 
        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int lastIndex = numbers.lastIndexOf(3);
        System.out.println(
            "The last occurrence of 2 is at index "
            + lastIndex);
        //Sublist
        System.out.println(numbers.subList(0, 2));
	}

}
