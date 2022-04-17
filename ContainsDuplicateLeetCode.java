package testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicateLeetCode {
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i< nums.length; i ++) {
			if(nums[i] == nums[i +1]) return true;
		}
		return false;
	}
	
	public static boolean ContainsDuplicate2(int[] nums) {
		HashSet<Integer> numbers = new HashSet<>();
		for (int i = 0; i < nums.length; i ++) {
			if(numbers.contains(nums[i])) return true;
			numbers.add(nums[i]);
		}
		return false;
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] nums = new int[n];
	
			for (int i = 0; i<n; i++) {
				nums[i]= sc.nextInt();
				
			
			}
			System.out.println(containsDuplicate(nums));
			System.out.println(ContainsDuplicate2(nums));
		}

}
