package collectionframework;

import java.util.LinkedList;

public class foreachdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList< String> ls = new LinkedList< String>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		for(String str : ls)
		{
		System.out.print(str+" ");
		}
	}

}
