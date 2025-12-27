package collectionframework;

import java.util.ArrayList;

public class generic1 {
	
	   public static void main(String[] args) {
	      ArrayList<String> my_list = new ArrayList<String>();
	      my_list.add("Joe");
	      my_list.add("Rob");
	      my_list.add("John");
	      my_list.add("Billy");
	      String s1 = my_list.get(0);
	      String s2 = my_list.get(1);
	      String s3 = my_list.get(3);
	      System.out.println(s1);
	      System.out.println(s2);
	      System.out.println(s3);

	   }
}
