package testing;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String a, String b) {
		/*
		 * 1. Remove whitespace
		 * 2. Remove case
		 * 3. if they have same no of elements then it is anagram else not
		 */
		a = a.replace(" ", "").toLowerCase();
		System.out.println(a);
		b = b.replace(" ", "").toLowerCase();
		System.out.println(b);
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c,d))
			return true;
		else {
			return false;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		boolean result = isAnagram(a,b);
		System.out.println((result)?"Anagrams": "Not Anagrams");
	}

}
