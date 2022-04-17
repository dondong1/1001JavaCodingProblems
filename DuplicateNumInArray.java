package testing;

import java.util.Scanner;

public class DuplicateNumInArray {
	static int firstDuplicate(int[] a) {
		for (int i = 0; i<a.length; i++) {
		if(a[Math.abs(a[i]) -1]<0)
		
			return Math.abs(a[i]);
	
		else {
			a[Math.abs(a[i]) -1] = -a[Math.abs(a[i])-1];
		}

	}
		
		return -1;
	}
	
	// Easy way but take more time complexity  or slower
	static int firstDup(int[] a) {
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i +1; j < a.length; j++) {
				if(a[i] == a[j]) {
					n = Math.min(n, j);
				}
			}
		}
		if(n == a.length) return -1;
		else
			
			return a[n];
	}
	
	//Third way
	static int firstDupe(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i +1; j < a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
					result = a[i];
				}
				
				
			}}
		return result;
	}
		
		
		
		
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		while (T --> 0) {
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
		System.out.println(firstDuplicate(a));
		System.out.println(firstDupe(a));
		System.out.println(firstDupe(a));
			
		}
		sc.close();

	}

}
