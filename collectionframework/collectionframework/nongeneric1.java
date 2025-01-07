package collectionframework;

import java.util.ArrayList;

public class nongeneric1 {
	public static void main(String[] args) {
	ArrayList my_list = new ArrayList();
    my_list.add("Joe");
    my_list.add("Rob");
    my_list.add("Nate");
    my_list.add("Bill");
    String s1 = (String)my_list.get(0);
    String s2 = (String)my_list.get(1);
    String s3 = (String)my_list.get(3);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
	}
}
