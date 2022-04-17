package testing;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class LongStringAndLength {
	public static String findLongString(String s1, String s2) {
		if (s1.length()> s2.length() ) {
			return s1;
		}
		else return s2;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first letter 's1':" );
		String s1 = sc.next();
		System.out.println("Please enter second letter 's2':" );
		String s2 = sc.next();
		String s3 = findLongString(s1, s2);
		
		System.out.println("the long string is:  " + s3 + "   with: " + s3.length() + "  characters");
		sc.close();
		System.out.println("compare alphabet index and return the length");
		System.out.println(s1.compareTo(s2)>0 ? s1 : s2);
		System.out.println(s1.compareTo(s2)>0 ? s1.length() : s2.length());
		System.out.println("compare the length and return the lenghth");
		System.out.println(s1.length()>s2.length() ? s1 : s2);
		System.out.println(s1.length()>s2.length() ? s1.length() : s2.length());
		
	}
}
