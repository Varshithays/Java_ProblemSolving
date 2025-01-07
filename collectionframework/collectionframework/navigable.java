package collectionframework;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigable {

	public static void main(String[] args) {
			NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

		    // Add elements using put() method
		    nm.put("C", 888);
		    nm.put("Y", 999);
		    nm.put("A", 444);
		    nm.put("T", 555);
		    nm.put("B", 666);
		    nm.put("Z", 555);

		    // Print the contents on the console
		    System.out.println("Mappings of NavigableMap : "
		                       + nm);

		    System.out.printf("Descending Set: %s%n ",
		                      nm.descendingKeySet());
		   System.out.printf("Floor Entry : %s%n ",
		                      nm.floorEntry("O"));//Entry with the lower key
		    System.out.printf("First Entry : %s%n",
		                      nm.firstEntry());// Entry with the least key
		    System.out.printf("Last Key : %s%n", nm.lastKey()); 
		    System.out.printf("First Key : %s%n",
		                      nm.firstKey()); 
		    System.out.printf("Original Map : %s%n", nm);
		    System.out.printf("Reverse Map : %s%n",
		                      nm.descendingMap()); //Reverse of the invoking map
		    System.out.printf("Higher Keys:%s%n",nm.higherKey("A"));
		    System.out.printf("Lower Keys:%s%n",nm.lowerKey("T"));
		    System.out.printf("Lower Entry:%s%n",nm.lowerEntry("T"));
		    System.out.printf("Higher Entry:%s%n",nm.higherEntry("T"));
		    System.out.printf("Ceiling Entry:%s%n",nm.ceilingEntry("X"));
		    System.out.printf("Ceiling Key:%s%n",nm.ceilingEntry("T"));
	}

}
