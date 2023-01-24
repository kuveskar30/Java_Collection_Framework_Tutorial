package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
//		String s = "hello";
//				
//		System.out.println(s.toUpperCase());
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("one");
		ar1.add("two");
		ar1.add("three");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("four");
		ar2.add("five");
		System.out.println(ar1);
		System.out.println("---------");
		
		ar1.set(1, "updated_two");
		System.out.println(ar1);
		
		System.out.println(ar1.get(1));
		
//		ar1.addAll(ar2);
//		ar1.addAll(0,ar2);//it will start adding from 0th index
//		System.out.println(ar1);
//		
//		ar1.clear();
//		System.out.println(ar1);
		
//		;
//		System.out.println(ar1.clone());
		
		//ar1.clone() returns obj, we have to cast it to ArrayList<String> obj
		ArrayList<String> ar3 = (ArrayList<String>)ar1.clone();
		
		System.out.println(ar3);
		
		System.out.println(ar1.contains("two"));//returns true if it contains specified value
		System.out.println(ar1.contains("k"));
		
		System.out.println(ar1.indexOf("three"));
		System.out.println(ar1.indexOf("three")>1);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","a","c","a","d"));
		System.out.println(list1.lastIndexOf("a"));
		System.out.println(list1.lastIndexOf("x"));//returns -1 if not present
		
		System.out.println(list1);
//		list1.remove(3);
		list1.remove("d");
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(list2);
		list2.removeIf(num ->num % 2 == 1);//it is lambda expression
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("ek","don","teen","char"));
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("a","b","a","c","a","d"));
		list3.addAll(list4);
		System.out.println(list3);
		list3.retainAll(list4);
		System.out.println(list3);
		list3.retainAll(Collections.singleton("a"));
		System.out.println(list3);
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> subList = new ArrayList<Integer>(list5.subList(2, 5));
		System.out.println(subList);// gives sub list from 2 to (5-1) index
		
		ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("ek","don","teen","char"));
		
		Object ob1[] = list6.toArray(); //returns static object array
		System.out.println(ob1);//you can't directly print static array
		System.out.println(Arrays.toString(ob1));
		
		for(int i=0; i<ob1.length; i++) {
			System.out.println(ob1[i]);
		}
		
		
		
	}
	
	
	
}
