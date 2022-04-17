package testing;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceArray {
	static int minimumAbsoluteDifference(int[] arr) {
		int min_abs_diff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i<arr.length-1; i++) {
			int current_abs_diff = Math.abs(arr[i] - arr[i+1]);
			min_abs_diff = Math.min(min_abs_diff, current_abs_diff);
		}
		return min_abs_diff;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer n: ");
		int n = sc.nextInt();
		System.out.println("Please enter the elements in your array:");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minimumAbsoluteDifference(arr));

	}

}
