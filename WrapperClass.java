package testing;

import java.util.ArrayList;

public class WrapperClass {
	//primitive data type: int, float, double, char
	//for every primitive type there is a class: Integer, Float, Double, Character
	//

	public static void main(String[] args) {
		int i =5; // This is a single value 
		Integer ii = new Integer(5); //This is an object
		Integer iii = new Integer(i); //place an primitive data into a class: BOXING
		Integer jj = i;           // This is called AutoBoxing
		//we can use this concept with any primitive data types.
		int j = jj.intValue();  //We called this is Unboxing
		int k = jj;  //We just assigned an object jj back to primitive data: AutoUnBoxing
		
		//We use clasess when we work with framework
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		//We use primitive when we work with loops
		for(int x = 0; x < values.size(); x++) {
			
		}

	}

}
