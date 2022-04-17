package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChefBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			if(n == 2) {
				System.out.println("0");
				continue;
			}
			
			
			if(n == 3) {
				System.out.println(Math.min(arr[1]-arr[0], arr[2]-arr[1]));
				continue;
			}
			int f =1; int l = n-2;
			long arr1=0, arr2 =0;
			for(int i = 0; i < n-1; i++) {
				arr1 += Math.abs(arr[i] - arr[(n-1)/2]);
//				System.out.println(arr1);
				arr2 += Math.abs(arr[i+1] - arr[1+(n-1)/2]);
//				System.out.println(arr2);
			}
			long sum = Math.min(arr1, arr2);
			while(f<l) {
				int sum2 = arr[n-1] - arr[f];
				int sum1 = arr[l] - arr[0];
				sum = Math.min(sum, Math.abs(sum1 -sum2));
				if(sum2>sum1) f++;
				else l --;
			}
			System.out.println(sum);

		}

	}

}
