package SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		//Set interface
		//HashSet,LinkedHashSet,TreeSet implements Set interface
		//it doesen't allow duplicate values
		//it doesen't follow indexing(i.e. ordering)
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("US");
		hs.add("India");
		hs.add("UK");//this duplicate value will not be added
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator<String> it1 = hs.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
