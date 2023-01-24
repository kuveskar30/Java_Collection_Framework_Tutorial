package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ArrayList is a default class available in java
		//it behaves like dynamic array
		
		//It doesen't follow sorting order
		
//		int i[] = new int[4];
//		System.out.println(i[2]); // it shows 0
		
//		creating ArrayList
		
		//default generics
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		ar.add("abhha");
		ar.add('t');
		ar.add(true);
		ar.add(10.33);
		
		
		
		
		
		System.out.println(ar);
		ar.set(1, "abha_updated");
		System.out.println(ar);
		System.out.println(ar.get(1));
		System.out.println("Array size = " + ar.size());
		System.out.println("Lowest index=" + "0");
		System.out.println("Higest index=" + (ar.size() - 1));
		
		ar.add(256);
		
		System.out.println("Array size = " + ar.size());
		
	}
	
	
}
