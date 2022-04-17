package testing;

public class MyException  extends Exception{
	public MyException(String s) {
		super(s);
	}



	public static void main(String args[]) {
		{
			try {
				throw new MyException("hello");
			}
			catch (MyException ex) {
				System.out.println("Got it");
				System.out.println(ex.getMessage());
			}
		}
	}
}
