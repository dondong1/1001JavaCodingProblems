package testing;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
	//SOLVE IT WITHOUT DIVISION and in O(n)
	static int[] productExceptSelf(int[] nums) {
		int  N = nums.length;
		// We see that the product of array except self is just equal
		//equal to the produc of all the left of any number multiply the product of all the right of that number
		//so we will create two array left for the product of all the left number of that number
		//array right for the product of all number right of that number
		//array product is the product of left and right
		//[1 2 3] then left [1 1 2] and right [6 3 1] --> [6 3 2]
		int[] left = new int[N];
		int[] right = new int[N];
		int[] product = new int [N];
		
		//The magic here is for the left array we set the index zero equal to 1
		left[0] = 1;
		//and the last index of array right is equal to 1
		right[N-1] = 1;
		
		//Then we iterate through the loop to fill in the product of the left and right array
		for (int i = 1; i< N; i++) {
			left[i] = nums[i-1]* left[i-1];
	
		}
		for (int i = N-2; i>= 0; i--) {
			right[i] = nums[i+1] * right[i+1];
		
		}
		for(int i = 0; i < N; i++) {
			product[i] = left[i] * right[i];
		}
		
		return product;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		while(T-->0) {
			for (int i = 0; i< n; i++) {
				nums[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(productExceptSelf(nums)));
		}
	}

}
