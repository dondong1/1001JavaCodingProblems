package testing;

import java.util.Scanner;

public class Loops2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number t of queries");
		int t = sc.nextInt();
		for (int i = 1;  i<=t; i++) {
			System.out.println("Please enter a:");
			int a = sc.nextInt();
			System.out.println("Please enter b:");
			int b = sc.nextInt();
			System.out.println("Please enter n:");
			int n = sc.nextInt();	
			for (int j = 0; j<n; j++) {
				a = a + ((int)Math.pow(2, j) * b);
				System.out.print(a + " ");
			}
			System.out.println();
			sc.close();
		}
		
	}
	
	
	
}
