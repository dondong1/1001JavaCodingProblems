package testing;

import java.util.Scanner;

public class MaxSubarrayProduct {
	static int maxSubArrayProduct(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int temp_max = Math.max(nums[i] * max, Math.max(nums[i]*min, nums[i]));
			min = Math.min(nums[i] * max, Math.min(nums[i]*min, nums[i]));
			max = temp_max;
			result = Math.max(result, max);

		}
		return result;
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
		System.out.println(maxSubArrayProduct(arr));
//		System.out.println(maxSubSumBruteForceApproach(arr));
		sc.close();

		}

	}
