package testing;

import java.util.Scanner;

public class Substring {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string :");
		String s = sc.next();
		System.out.println("Please enter the substring index start with:");
		int a = sc.nextInt();
		System.out.println("Please enter the end substring index: ");
		int b = sc.nextInt();
		System.out.println("Your substring is: ");
		System.out.println(s.substring(a, b));
		sc.close();
		
	}

}
