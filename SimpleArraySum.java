package testing;

import java.util.Scanner;

public class SimpleArraySum {
	static int simpleArraySum(int[] ar) {
	int ar_sum = 0;
	for (int i = 0; i < ar.length; i++) {
		ar_sum += ar[i];
		
	}
	return ar_sum;
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number \"n \" of elements in the array:");
	int n = sc.nextInt();
	int[] ar = new int[n];
	System.out.println("Please enter the elements in the array n: ");
	
	for (int i = 0; i < n; i ++) {
		ar[i] = sc.nextInt();
	}
	System.out.println(simpleArraySum(ar));
	
	}

}
