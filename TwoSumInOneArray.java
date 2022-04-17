package testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumInOneArray {
	static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int i = 0; i< nums.length -1; i++)  {
			for (int j = i+1; j< nums.length; j ++) {
				if(nums[i]+nums[j]== target) {
					result[0] =i;
					result[1] =j;
				}
			}
		}
		return result;
	}
	static int[] towSum2(int[] nums, int target) {
		Map<Integer, Integer> num_map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i ++) {
			int complemnet = target - nums[i];
			if(num_map.containsKey(complemnet)) {
				return new int[] {num_map.get(complemnet), i};
			}
			num_map.put(nums[i],i);
				
			}
		throw new IllegalArgumentException("no match found!");
		
		}
	public static int[] twoSum3(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if(map.containsKey(difference)) {
				result[0] = map.get(difference);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
	
			for (int i = 0; i<n; i++) {
				nums[i]= sc.nextInt();
				
			
			}
			System.out.println(Arrays.toString(twoSum(nums, target)));
			System.out.println(Arrays.toString(towSum2(nums, target)));
			System.out.println(Arrays.toString(twoSum3(nums, target)));
		}

	}


