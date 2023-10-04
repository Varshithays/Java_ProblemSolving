/*import java.util.* ;
import java.io.*; 
public class secondlargest {
	
		public static void main(String[] args){
		List<Integer> v=new ArrayList<>(Arrays.asList(2,3,4,17,89,45));

		Set<Integer> s = new TreeSet<>(v);
		 v.clear();
        //insert all elements back in ArrayList in sorted order.
        for (int value : s) {
            v.add(value);
        }
        //the size of updated ArrayList.
       int n = v.size();

		System.out.println(v.get(n-2));
    }
	
}*/
// JAVA Code for Find Second largest
// element in an array
import java.io.*;

class secondlargest {

	/* Function to print the second largest
	elements */
	public static void print2largest(int arr[],
									int arr_size)
	{
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/* If current element is greater than
			first then update both first and second */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/* If arr[i] is in between first and
			second then update second */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest"
							+ " element\n");
		else
			System.out.print("The second largest element"
							+ " is " + second);
	}

	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] = { 12, 25, 1, 10, 34, 1 };
		int n = arr.length;
		print2largest(arr, n);
	}
}
// This code is contributed by Arnav Kr. Mandal.
