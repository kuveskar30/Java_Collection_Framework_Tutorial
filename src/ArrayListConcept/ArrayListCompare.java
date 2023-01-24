package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		//1. sort then equals
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","c","b","d","e"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("a","c","b","d","f"));
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("a","c","b","e","d"));
		
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list3);
		
		System.out.println(list1.equals(list2));//false
		System.out.println(list1.equals(list3));//true
		
		//2. compare two list -- find out additional elements
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("a","c","b","d","e"));
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("a","c","d","b","f"));
		
//		list4.removeAll(list5);
//		System.out.println(list4);
		
		//3. find out -- missing element
		
		list5.removeAll(list4);
		System.out.println(list5);
		
		//4. find out common elements
		ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("a","c","b","d","e"));
		ArrayList<String> list7 = new ArrayList<String>(Arrays.asList("a","c","d","b","f"));
		
		list6.retainAll(list7);
		System.out.println(list6);
		
		
		
		
		
	}

}
