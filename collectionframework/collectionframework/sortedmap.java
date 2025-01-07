package collectionframework;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmap {

	public static void main(String[] args) {
		SortedMap<String, Integer> sortedMap = new TreeMap<>();
		 
        // Adding elements to the sorted map
        sortedMap.put("A", 1);
        sortedMap.put("C", 3);
        sortedMap.put("B", 2);
        sortedMap.put("D", 6);
        sortedMap.put("E", 5);
        System.out.println(sortedMap); //Ascending Order
        System.out.println( sortedMap.headMap("B"));
       System.out.println( sortedMap.tailMap("B")); //It returns a view of the portion of 
       //this map whose keys are strictly greater than or equal to fromKey.
       System.out.println( sortedMap.subMap("C", "E"));
        Set s = sortedMap.entrySet();
        System.out.println(s);
        // Getting values from the sorted map
        int valueA = sortedMap.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the sorted map
        sortedMap.remove("D");
 
        // Iterating over the elements of the sorted map
        for (String key : sortedMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sortedMap.get(key));
        }
	}

}
