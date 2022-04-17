package testing;

import java.util.HashSet;
import java.util.Scanner;

public class sumOfTwoFromTwoArrays {
	static boolean sumOfTwo(int[] a, int[]b, int v) {
		HashSet<Integer> differences = new HashSet();
		for(int i = 0; i < a.length; i++) {
			int difference = v - a[i];
			differences.add(difference);
		}
		for (int i = 0; i< b.length; i++) {
			if(differences.contains(b[i])) return true;
		}
		return false;
	}
	static boolean anotherWay(int[]a , int[]b, int v) {
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j < b.length; j ++) {
				if (a[i] + b[j] == v) 
					return true;
				
			
			}
			
		}
	 return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		int[] a = new int[n];
		int [] b = new int[m];
		while(T --> 0) {
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i<m; i++) {
				b[i] = sc.nextInt();
			}
			System.out.println(sumOfTwo(a, b, v));
			System.out.println(anotherWay(a, b, v));
	
		}
		
		

	}

}
