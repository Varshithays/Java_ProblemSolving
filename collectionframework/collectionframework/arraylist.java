package collectionframework;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();//empty arraylist
		System.out.println("Initial size of al: " + al.size());
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("Contents of al: " + al);
		al.add(1,"A2");
		System.out.println(" updated Contents of al:"+al);
		System.out.println("Size of al after additions:"+al.size());
		// Display the array list.
		System.out.println("Contents of al: " + al);
		// Remove elements from the array list.
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("mahesh");
		al1.add("Vijay");
		al1.add("pramod");
		System.out.println("Contents of al1: " + al1);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("pramod");
		al2.add("naveen");
		al2.add("goutham");
		al1.addAll(al2);//adding second list in first list
		System.out.println("Contents of al1: " + al1);
		al1.retainAll(al2);
		System.out.println("Contents of al1 using reatain all: " + al1);
		al1.removeAll(al2);
		System.out.println("Contents of al1: " + al1);

	}

}
