package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,3,2,1,2,4,5,6,7,5,9,8,1,4));
		
		LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>(linkedHashset);
		//on linkedHashSet we can't random access like ArrayList so better to convert it to ArrayList
		System.out.println(linkedHashset);
		System.out.println(list2);
		
		//random access on linkedHashset not possible hence used iterator
		Iterator<Integer> i1 = linkedHashset.iterator();
		System.out.println(i1);
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,3,2,1,2,4,5,6,7,5,9,8,1,4));
		List<Integer> distinctMarkList = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctMarkList);
		
	
	}

}
