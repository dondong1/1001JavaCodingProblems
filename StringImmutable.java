package testing;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";
		System.out.println(input + "name");
		input = "hi";
		String abc = "hi";
		if(input.equals(abc)) {
			System.out.println("Ah");
		}
		
		
		System.out.println(input + "name");
	}

}
