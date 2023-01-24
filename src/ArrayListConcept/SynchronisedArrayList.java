package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {

	public static void main(String[] args) {
		
		//1. Collections.sychronizedList
		List<String> list1 = Collections.synchronizedList(new ArrayList<String>());
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		//add,remove we don't use explicit synchronization
		//to fetch/traverse values from this list -- we have to use explicit synchronization
		
		synchronized (list1) {//it is explicit synchronization
			Iterator<String> s1 = list1.iterator();
			
			while(s1.hasNext()) {
				System.out.println(s1.next());
			}
			
		}
		
		//2. CopyOnWriteArrayList -- it is a class thread safe already
		
		CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		Iterator<String> s2 = list2.iterator();
		
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}

	}

}
