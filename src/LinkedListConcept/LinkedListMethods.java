package LinkedListConcept;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		
		System.out.println(l1);
		l1.addFirst("zero");
		l1.addLast("five");
		System.out.println(l1);
	
		l1.removeFirst();
		System.out.println(l1);
		
		
		
	}

}
