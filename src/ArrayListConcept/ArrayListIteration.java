package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arI = new ArrayList<Integer>();
		arI.add(100);
		arI.add(50);
		arI.add(456);
		//for loop
		for(int i=0; i<arI.size(); i++) {
			System.out.println(arI.get(i));
		}
		
		//for each loop, int s denotes type of value stored, and arI is name of object
		for(int s: arI) {
			System.out.println(s);
		}
		
		//Iterator
		Iterator<Integer> ob1 = arI.iterator();
		
		
		
		System.out.println(ob1);
//		System.out.println(Arrays.toString(ob1));//not applicatble for iterator
		
		while(ob1.hasNext()) {
			System.out.println(ob1.next());
		}
		
		
		System.out.println("*7*7*7*7");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		numbers.add(45698);
		System.out.println(numbers);
		
		ListIterator<Integer> l1 = numbers.listIterator();
		
//		l1.next();
//		l1.next();
//		l1.next();
		//I have moved cursor 3 elements forward, so it will print elements from 4th index
		
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		
//		l1.next();
//		l1.next();
//		l1.previous();
//		l1.add(456);
		
//		numbers.add(2, 303);
		
//		l1.next();
//		l1.set(11);//replaces last element returned by next() or previous() method
		
//		numbers.set(2, 303);
		
//		l1.next();
//		l1.next();
//		l1.remove();
		
//		l1.next();
//		l1.remove();
		
		System.out.println(numbers);

	}

}
