package testing;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class SubstringComparisions {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		SortedSet<String> s1 = new TreeSet<String>();
		for (int i = 0; i<= s.length()-k; i++) {
			s1.add((s.substring(i, i+k)));
		}
		smallest = s1.first();
		largest = s1.last();
		return smallest + "\n" + largest;
	}
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int k = sc.nextInt();
	sc.close();
	
	System.out.println(getSmallestAndLargest(s,k));
	}

}
