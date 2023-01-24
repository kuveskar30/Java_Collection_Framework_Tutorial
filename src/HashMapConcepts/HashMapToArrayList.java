package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3,"c");
		
		
		
		System.out.println(m1);
		 
		ArrayList<Integer> key1 = new ArrayList<Integer>(m1.keySet());
		
		System.out.println(key1);
		
		ArrayList<String> values1 = new ArrayList<String>(m1.values());
		
		System.out.println(values1);

	}

}
