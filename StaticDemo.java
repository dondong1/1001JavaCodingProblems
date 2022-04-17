package testing;

public class StaticDemo {
	
	//lets say we have a class Emp
	
	static class Emp{
		int eid;
		int salary;
		static String ceo;
		
		//static block dept will be run when you load a class
		static String dept;
		static { 
			dept = "Human Resource";
		}
		
		/* 
		 * A static method manipulates the static variables in a class. 
		 * It belongs to the class instead of the class objects 
		 * and can be invoked without using a class object. 
		 * The static initialization blocks can only initialize the static instance variables. 
		 * These blocks are only executed once when the class is loaded
		 */
	}

	public static void main(String[] args) {
	
		// We can create objects navin and rahul from the class Emp
		Emp narvin = new Emp();
		// We can use narvin as an object to enter its object data for eid, salary
		// but we can't use Emp.eid or Emp.salary
		narvin.eid = 8;
		narvin.salary = 4000;
		//For String ceo, we used keyword static so String ceo can be called from class or object
		//normally when use keyword static people called it from class
		Emp.ceo = "Mahesh";
		//same thing for class, if we don't use keyword static we won't be able to create new object from Emp
	}

}
