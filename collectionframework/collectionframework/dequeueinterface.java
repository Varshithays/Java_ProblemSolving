package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Deque<Integer> deque = new ArrayDeque<>();
		    deque.addFirst(1);
		    deque.add(3);
		    deque.add(4);
		    deque.add(5);
		    deque.addLast(2);
		    //Add at the last
		    deque.offer(8);
		    //Add at the first
		    deque.offerFirst(9);
		    System.out.println(deque);
		 // We can remove the first element
	        // or the last element.
		    int first = deque.removeFirst();
		    int last = deque.removeLast();
		    System.out.println("First: " + first + ", Last: " + last);
		    System.out.println(deque);
	}

}
