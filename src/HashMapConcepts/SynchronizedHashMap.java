package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedHashMap {

	//1. HashMap -- not thread safe
	//can have one null key and multiple null values
	
	//2.HashTable -- thread safe
	//slow performance
	//null key and values not allowed
	
	//3. synchronizedMap-- thread safe
	//slow performance
	//can have one null key and multiple null values
	
	//4. ConcurrentHashMap -- thread safe
	//fast performance
	//lock while update/write, no lock while reading
	//null key and values not allowed
	public static void main(String[] args) {
		
		//synchronizedMap method in collections class
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3,"c");
		
		//create synchronizedMap
		Map<Integer,String> synchM1 = Collections.synchronizedMap(m1);
		System.out.println(synchM1);
		
		//ConcurrentHashMap : it does not show any ConcurrentModificationException
		ConcurrentHashMap<Integer,String> m2 = new ConcurrentHashMap<Integer,String>();
		m2.put(1, "a");
		m2.put(2, "b");
		m2.put(3,"c");
		System.out.println(m2);
	}

}
