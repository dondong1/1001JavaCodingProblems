package testing;

import java.util.HashMap;
import java.util.Scanner;

public class ContaintDuplicate2LeetCode {
	//Given an array of integers and an integer k, find out whether there are two distinct indices i and j
	// in the array such that num[i] = num[j] and the absolute difference i and j is at most k
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		for(int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j] && j - i <= k) return true;
			}
		}
		return false;
	}
	public static boolean containsMethod2UsingHashMap(int[] nums, int k) {
		//For every element that has occurred we need to know where -> we need a HashMap not just a HashSet
		//Because we need to store two pieces of information
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i ++) {
			int current = nums[i];
			if(map.containsKey(current) && i - map.get(current) <= k) {
				return true;
			}
			else {
				map.put(current, i);
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println("Please enter the number n of elements in your array:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sum k:");
		int k = sc.nextInt();
	
		System.out.println("Please enter the elements in your array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(containsNearbyDuplicate(arr, k));
		System.out.println(containsMethod2UsingHashMap(arr, k));
		sc.close();

		}

	}
