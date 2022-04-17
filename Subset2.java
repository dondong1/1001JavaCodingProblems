package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset2 {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
		return subsets;
	}
	public static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {
		subsets.add(new ArrayList<>(current));
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			generateSubsets(index+1, nums, current, subsets);
			current.remove(current.size() -1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		while(T-->0) {
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt(); 
			}
			System.out.println(subsets(nums));
		}

	}

}
