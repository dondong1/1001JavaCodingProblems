package testing;

import java.util.Scanner;

public class IntToString {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		String s = n + "";
		System.out.println(s);
		String t = Integer.toString(n);
		System.out.println(t);
		String u = String.valueOf(n);
		System.out.println(u);
		if(n == Integer.parseInt(s) && n == Integer.parseInt(t) && n == Integer.parseInt(u)) {
			System.out.println("Good job");
		}
		else {
			System.out.println("Wrong answer");
		}
		
		
	}

}
