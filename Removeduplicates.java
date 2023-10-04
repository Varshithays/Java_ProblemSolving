// Java Program to Remove Duplicate Elements
// From the Array using HashMap

import java.util.HashMap;

class Removedupliactes {
	static void removeDups(int[] a, int n)
	{

		// Hash map which will store the
		// elements which has appeared previously.
		HashMap<Integer, Boolean> mp = new HashMap<>();

		for (int i = 0; i < n; ++i) {

			// Print the element if it is not
			// present there in the hash map
			// and Insert the element in the hash map
			if (mp.get(a[i]) == null)
			{
				System.out.print(a[i] + " ");
				mp.put(a[i], true);
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
	
		int n = arr.length;
		removeDups(arr, n);
	}
}

/*public class Removeduplicates {
	public static int removeDuplicates(int a[], int n)
	{
		// if(array size if 0 or 1 array is already sorted)
		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}

		a[j++] = a[n - 1];

		return j;
	}

	public static void main(String[] args)
	{
		int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 ,6};

		int n = a.length;
		
		int j=0;
	
	
		j = removeDuplicates(a, n);

		// printing array elements
		for (int i = 0; i < j; i++)
			System.out.print(a[i] + " ");
	}
}*/
