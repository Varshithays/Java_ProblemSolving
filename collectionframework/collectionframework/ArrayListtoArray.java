package collectionframework;

import java.util.ArrayList;

public class ArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array list.
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Add elements to the array list.
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Contents of al: " + al);
		// Get the array.
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		// toArray( ) is called and it obtains an array of Integers.
		int sum = 0;
		// Sum the array.
		for(int i : ia)
		sum += i;
		System.out.println("Sum is: " + sum);
	}

}
