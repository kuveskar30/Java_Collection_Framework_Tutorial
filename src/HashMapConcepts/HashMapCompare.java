package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3,"c");
		
		HashMap<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(3,"c");
		m2.put(1, "a");
		m2.put(2, "b");
		
		HashMap<Integer,String> m3 = new HashMap<Integer,String>();
		m3.put(1, "a");
		m3.put(2, "b");
		m3.put(3,"c");
		m3.put(3,"d");
		
		//1.comparing HashMaps: on basis of key-value pair
		//order dosen't matter in HashMap, only key-value pair should be same
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		//2.comparing HashMaps: for same keySets : keySet()
		System.out.println(m1.keySet().equals(m2.keySet()));
		System.out.println(m1.keySet().equals(m3.keySet()));
		
		//3. find out extra keys by comparing m1 and m4
		HashMap<Integer,String> m4 = new HashMap<Integer,String>();
		m4.put(1, "a");
		m4.put(2, "b");
		m4.put(3,"c");
		m4.put(4,"d");
		
//		System.out.println(m4);
		//combine/union keys from both maps using HashSet
		HashSet<Integer> commonKeys= new HashSet(m1.keySet()); 
		System.out.println(commonKeys);
		//add keySet from m4
		commonKeys.addAll(m4.keySet());
		
		System.out.println(commonKeys);
		
		commonKeys.removeAll(m1.keySet());
		System.out.println(commonKeys);
		
		//4. Compare maps by values
		HashMap<Integer,String> m5 = new HashMap<Integer,String>();
		m5.put(1,"a");
		m5.put(2,"b");
		m5.put(3,"c");
		
		HashMap<Integer,String> m6 = new HashMap<Integer,String>();
		m6.put(4, "a");
		m6.put(5, "b");
		m6.put(6, "c");
		
		
		HashMap<Integer,String> m7 = new HashMap<Integer,String>();
		m7.put(1, "a");
		m7.put(2, "b");
		m7.put(3, "c");
		m7.put(4, "c");
		
				//4a. duplicates not allowed: using ArrayList
				System.out.println((new ArrayList<>(m5.values()).equals(new ArrayList<>(m6.values()))));
				System.out.println((new ArrayList<>(m5.values()).equals(new ArrayList<>(m7.values()))));
				
				//4b. duplicates allowed
				System.out.println((new HashSet<>(m5.values()).equals(new HashSet<>(m6.values()))));
				System.out.println((new HashSet<>(m5.values()).equals(new HashSet<>(m7.values()))));
		
	}

}
