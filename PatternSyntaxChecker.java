package testing;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
	public static void main (String[] args) {
		System.out.println("Please enter an Integer N for test cases: ");
		Scanner sc = new Scanner(System.in);
	
		int testCases = Integer.parseInt(sc.nextLine());
		while(testCases>0) {
			String pattern = sc.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException ex) {
				System.out.println("Invalid");
			}
		
		}
		sc.close();
		
	}
}
