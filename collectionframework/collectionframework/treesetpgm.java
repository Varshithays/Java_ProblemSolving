package collectionframework;

import java.util.*;



public class treesetpgm {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("C");  
		  al.add("A");  
		  al.add("B");  
		  al.add("E"); 
		  al.add("F");
		  al.add("D");
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println(al.subSet("C", "F"));
	}

}
