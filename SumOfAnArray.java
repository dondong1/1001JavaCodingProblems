package testing;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAnArray {
	static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
		 sum += arr[i];
		}
		
		return sum;
	}
	public static void main(String[] args) {
	System.out.println("Please enter the number n of elements in your array:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Please enter the elements in your array:");
	int[] arr = new int[n];
	for(int i =0; i< n; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Sum of elements in the array is: "+sumArray(arr));
	System.out.println("Your array is: " + Arrays.toString(arr));

	}

}
