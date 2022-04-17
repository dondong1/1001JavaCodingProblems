package testing;

import java.util.HashMap;

//Given ar arrayof integers and an integer k, you need to find the total 
//number of continuous subarrays whose sum equals to k
// Ex: Input: nums = [1, 1, 1]. k = 2
//Output: 2

public class ContinuousSubArraysWhoseSumEqualsToK {
	public static int subarraySum(int[] nums, int k) {
		//We create a HashMap to store all the sum and checking if it already in the HashMap?
		HashMap<Integer, Integer> arr_sums = new HashMap<>();
		//We set the first sum equals to zero and seen it 1 times.
		arr_sums.put(0,1);
		//We intialize variable sum 
		int sum = 0;
		int result = 0;
		//We going to loop through the length of the array nums to add to ongoing sum
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(arr_sums.containsKey(sum-k)){
				result += arr_sums.get(sum-k);
			}
			
			/*
			 * java.util.Map.getOrDefault(Object key, V defaultValue)
			 * Returns the value to which the specified key is mapped,
			 *  or defaultValue if this map contains no mapping for the key.
			 * */
			arr_sums.put(sum, arr_sums.getOrDefault(sum, 0) +1);
		}
		return result; 
	}
	public static void main(String[] args) {
		int[] nums = {2, 4, 6, 1};
		System.out.println(subarraySum(nums, 1));

	}

}
