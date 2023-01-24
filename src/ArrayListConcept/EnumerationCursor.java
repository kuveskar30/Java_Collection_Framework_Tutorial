package ArrayListConcept;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<Object>();
		
		v1.add(10);
		v1.add("ten");
		v1.add(10.5);
		
		System.out.println(v1);
		
		Enumeration<Object> e1 = v1.elements();
		
		while(e1.hasMoreElements()) {
			
			System.out.println(e1.nextElement());
		}
		
		

	}

}
