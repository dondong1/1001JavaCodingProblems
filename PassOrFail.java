package testing;

import java.util.Scanner;

public class PassOrFail {
	static String passOrFail(int n, int x, int p) {
		if((4*x - n) >= p) {
			return "PASS";
		}
		else return "FAIL";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many test cases you want to check: ");
		int a = sc.nextInt();
		
		while(a-->0) {
			System.out.println("What is the total number of questions: ");
			int n = sc.nextInt();
			System.out.println("What is the number correct answers");
			int x = sc.nextInt();
			System.out.println("What is the requirement to Pass: ");
			int p = sc.nextInt();
			
			System.out.println(passOrFail(n, x, p));
		} 
		
		

	}

}
