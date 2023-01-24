package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<Integer,String> m3;
	
	static {
		m3 = new HashMap<>();
		m3.put(1, "a");
		m3.put(2, "b");
	}
	
	
	public static void main(String[] args) {
		
		//ways of creating HashMap
		//1. using HashMap Class
		HashMap<String,String> m1 = new HashMap<String,String>();
		Map<String,String> m2 = new HashMap<String,String>();//top-casting

		//2. static way: static HashMap (It is not a preferred way)
		System.out.println(HashMapInitialization.m3.get(1));
		
		//3. immutableMap with only one single entry (it will allow only one value)
		Map<Integer,String> m4 = Collections.singletonMap(1, "Mumbai");
		System.out.println(m4.get(1));
//		m4.put(1, "pune");//UnsupportedOperationException
		
		//4. JDK 8
		// creating one 2d array of string using streams and collecting it in form of map
		Map<String,String> m5 = Stream.of(new String[][]{
			{"Tom", "a grade"},
			{"ruby", "a+ grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(m5.get("Tom"));
		m5.put("lisa","b grade");
		System.out.println(m5.get("lisa"));
		
		//5.using simpleEntry
		Map<String,String> m6 = Stream.of(
				new AbstractMap.SimpleEntry<>("mah", "mumbai2"),
				new AbstractMap.SimpleEntry<>("raj", "jaipur")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(m6.get("mah"));
		m6.put("goa", "panaji");
		System.out.println(m6);
		
		//6. JDK 1.9 
		//empty immutable map using Map.of()
		Map<String,String> m7 = Map.of();
//		m7.put("a", "apple");//UnsupportedOperationException
		
		//singleton map
		Map<String,String> m8 = Map.of("a","apple");
		System.out.println(m8.get("a"));
		//m8.put("a", "apple");//UnsupportedOperationException
		
		//multi valued map : max 10 pairs can be stored
		Map<String,String> m9 = Map.of("a","apple","b","ball","c","cat");
		System.out.println(m9.get("c"));
		//m9.put("k", "kettle");//UnsupportedOperationException
		
		//Map.ofEntries(): multiple pair at time of creation can be added
		//these are Immutable
		Map<String,String> m10  = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("d","dog"),
				new AbstractMap.SimpleEntry<>("e","elephant")
				);
		
		System.out.println(m10.get("e"));
		
		//it is not working
//		Map<String,String> m11 = ImmutableMap.of("g","google","m","microsoft","a","apple");
		
		
	}

}
