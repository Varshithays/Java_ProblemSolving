package collectionframework;

import java.util.HashSet;

public class hashsetpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		HashSet< String> hs = new HashSet< String>();
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F"); //Skips duplicates
		System.out.println(hs);
		HashSet< Integer> hs1 = new HashSet< Integer>();
		hs1.add(10);
		hs1.add(677);
		hs1.add(5);
		hs1.add(4);
		hs1.add(4);//Skips duplicates
		System.out.println(hs1);
	}

}
