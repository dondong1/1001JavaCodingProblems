package testing;

import java.util.Scanner;

public class ArrayMaxConsecutiveSumLeetCode {
	static int maxSubArray(int[] nums) {
		int max_sum = nums[0];
		int current_sum = max_sum;
		for (int i = 1; i < nums.length; i++) {
			current_sum = Math.max(nums[i] + current_sum, nums[i]);
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum;
	}
	static int maxSubSumBruteForceApproach(int[] nums) {
		//Declare a variable maxSubarraySum
		int maxSubarraySum = 0;
		// Explore all subarray(i,j) using a outer loop from 0 to n-1 and inner loop run from j = i to n-1
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j ++) {
				// For each subarray we run another llop from k = i to j and calculate the sub array sum betwwen them
				//We store this value in a variable subarraySum
				int subarraySum = 0;
				for(int k = i; k <= j ; k ++) {
					subarraySum = subarraySum + nums[k];
					//if we find subarraySum > maxSubarraySum then update maxSubarraySum with subarraySum
					if(subarraySum > maxSubarraySum)
						maxSubarraySum = subarraySum;
				}
			}
		
		}
		// return maxSubarraySum
		return maxSubarraySum;
		
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
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubSumBruteForceApproach(arr));
		sc.close();

		}

	}