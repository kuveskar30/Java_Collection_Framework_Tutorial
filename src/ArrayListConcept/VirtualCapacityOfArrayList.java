package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {

	public static void main(String[] args) {

		// by default virtual capacity of ArrayList array is 10 (0 to 9 index)
		// Naveen was able to see virtual capacity while debugging
		// But when I tried It was not showing virtual capacity 
		
		ArrayList<Object> ar = new ArrayList<Object>();

		System.out.println(ar.size());// it is showing physical capacity

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(45);
		ar.add(98);

		System.out.println(ar.size());// it is showing physical capacity

	}

}
