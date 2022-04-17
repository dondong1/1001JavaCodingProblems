package testing;

public class Fun {
	// For Fun What will be the output of the following java code snippet?
	
	private static float temp() {
		//the mistatke is here: you can't have a method within a method -> Compile time error
		// you can remove public or have to  write the method inside a local class or through a local interface with one abstract method run();
		/* remove this --> public static <--- remove */ float sum = 21;
		return (--(sum));
	}

	public static void main(String[] args) {
		Fun fun = new Fun();
		System.out.println(fun.temp());

	}

}
