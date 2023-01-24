package ArrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arI = new ArrayList<Integer>();
		arI.add(100);
		arI.add(50);
		
		ArrayList<String> arS = new ArrayList<String>();
		arS.add("hello");
		arS.add("diwali");
		
		ArrayList<Boolean> arB = new ArrayList<Boolean>();
		arB.add(true);
		arB.add(false);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(10.33);
		arD.add(3.6);
		
		System.out.println(arB);
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		ar.add("abhha");
		ar.add('t');
		ar.add(true);
		ar.add(10.33);
		
		System.out.println(ar);

	}

}
