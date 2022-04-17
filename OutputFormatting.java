package testing;

import java.util.Scanner;

public class OutputFormatting {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 courses and their prices:");
		for (int i = 0; i< 3; i++) {
			String s = sc.next();
			int    n = sc.nextInt();
			System.out.println("Here is the courses with prices formatted:");
			System.out.printf("%-15s%d\n", s, n);
		}
		
		
	}

}
