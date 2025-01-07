package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection = new ArrayList<String>();
		 
        collection.add("zero");
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        Iterator<String> iterator = collection.iterator();
 
        // while loop
        while (iterator.hasNext()) {
        System.out.println("value= " + iterator.next());
        }
	}

}
