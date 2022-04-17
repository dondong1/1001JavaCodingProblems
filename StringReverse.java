package testing;

import java.util.Scanner;


public class StringReverse {
	static String reverse(String str) {
		
		String rev = "";
		int len = str.length(); 
		for (int i = len-1; i >= 0; i --) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse of string is: " + rev);
		return rev;
	}
	static String reverse2(String str) {
		char a[] = str.toCharArray();
		String rev = "";
		int len = a.length;
		for (int i = len -1; i>= 0; i --) {
			
			rev += a[i]; // same as rev = rev + a[i];
			
		}
		return rev;
	}
	
	static String reverse3(String str) {
		String B = new StringBuilder(str).reverse().toString();
		return B;
	}

	public static boolean Palindrome(String A) {
	
	int lens = A.length();
	for (int j = 0; j < lens/2; j++) {
		if(A.charAt(j) != A.charAt(lens -j-1)) {
			return false;
		} }
			return true;
		
	}
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String A = sc.next();
		sc.close();
		Palindrome(A);
		
			String B = new StringBuilder(A).reverse().toString();
			System.out.println(B);
			System.out.println(reverse(A));
			System.out.println(reverse2(A));
			System.out.println(reverse3(A));
			if(A.equals(B))
				System.out.println("YES");
			else System.out.println("NO");
		}
		
	}

