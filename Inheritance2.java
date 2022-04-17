package testing;

public class Inheritance2 {
	 static class Arithmetic {
		int add(int a, int b)
		{
			return a+b;
		}
	}
	 static class Adder extends Arithmetic {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.println(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
	}

}
