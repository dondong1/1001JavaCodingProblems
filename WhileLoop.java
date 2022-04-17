package testing;

public class WhileLoop {

	public static void main(String[] args) {
		int x = 1;
		while(x<= 10 ) {
			System.out.println(x);
			x++;
		}
		System.out.println("Loop finished");
		
		
		//break keyword
		x =1;
		while(x <= 10) {
			System.out.println("I am broken");
			x++;
			break;
		}
		
		// continue keyword
		x =1; 
		while(x <= 10) {
			System.out.println(" I am continuos");
			x++;
			continue;
		}
	
		System.out.println(" Continue  when it is true");
		
		// continue keyword
		x =1; 
		while(x <= 10) {
			x++;
			if(true) {
			continue;
		}
			System.out.println("I got skipped looping");
	}
		System.out.println("what the heck just happened?");
	}
}
