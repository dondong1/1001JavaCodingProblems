package testing;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		int value = 5;
		List values = new ArrayList();
		values.add(7);
		values.add("Navin");
		
		//Look up the above codes, we declared List but this list can add any type of primitive data
		// you can add int or char, String...
		//So in order to strictly enforce only one type of data class for it we have to declare 
		
		List<Integer> newValues = new ArrayList<Integer>();
		newValues.add(7); // is ok but newValues.add("Navin") is not accepted.

	}

}
