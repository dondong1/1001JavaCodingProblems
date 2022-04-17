package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;


public class MaxPopularityAmazon {
	/*
	 * Amazon Shopping has n items in inventory. Each item has a rating that may be negative.
	 *  The team wants to work on an algorithm that will suggest combinations of these items that
	 *   customers might buy, or, combos for short. 
	 *   A combo is defined as a subset of the given n items. 
	 *   The total popularity of a combo is the sum of the popularities of the individual items in the combo. 
	 *   Design an algorithm that can find the k combos with the highest popularities.
	 *    Two combos are considered different if they have a different subset of items
	 *    . Return an array of k integers where the denotes the popularity of ith best combo. 
	 *    Combos should be returned arranged best to worst.

Note: You can have an empty subset as a combo as well. The popularity for such a subset is 0.

Example
n = 3
popularity= [3, 5, -2]
k = 3

All possible popularities of combos are 0, 3, 5, -2, 8, 3, 1, 6.
 The best three combos have popularities 8, 6, and 5. The answer is [8, 6, 5].

Returns

int[k]: the popularities of the best k combos, in decreasing order.

Constraints

1 <= n <= 10^5
-10^9 <= popularity[i] <= 10^9
1 <= k <= min(2000, 2^n)
	 */
	
	public static int[] topKSum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        subsetKSum(pq, k, 0, nums, 0);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        int[] finalResult = Arrays.stream(result).boxed()
        	    .sorted(Collections.reverseOrder())
        	    .mapToInt(Integer::intValue)
        	    .toArray();
        return finalResult;
    }

    private static void  subsetKSum(PriorityQueue<Integer> result, int k, int sum, int[] nums, int current) {


        for (int i = current; i < nums.length; i++) {
            int nextSum = sum + nums[i];
            result.add(nextSum);
            if (result.size() > k) {
                result.poll();
            }
            subsetKSum(result, k, nextSum, nums, i +1);

        }
    }
	
//	public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (b-a));
//	public static int[] maxPopularity(int[] arr, int k) {
//		
//		subsetSum(arr,0,arr.length-1,0);
//		int[] ans = new int[k];
//		int i = 0;
//		while(!pq.isEmpty() && i<k) {
//			ans[i] = pq.poll();
//			i++;
//		}
//		System.out.println(Arrays.toString(ans));
//		return ans;
//		
//	}
//	public static void subsetSum(int[] arr, int l, int r, int sum) {
//		if(l<r) {
//			pq.offer(sum);
//			return ;
//		
//		}
//	subsetSum(arr, l+1, r, sum+arr[1]);
//	subsetSum(arr,l+1, r, sum);
//	return ;
//	}
	// ANOTHER WAY
//	public static int[] maxPopularity(int[]a, int k) {
//		//Complexity is nlog(n) + 2^k
//		//sort the array
//		Arrays.sort(a);
//		int n = a.length;
//		long sum = 0;
//		int neg = 0;
//		//Record the highest score combo which is the sum of all positive integers.
//		for (int i=0; i<a.length; i++) {
//			if(a[i]>=0) sum += a[i];
//			if(a[i]<0)neg++;
//		}
//		//Find a window in the sorted array of math.min(11,n) elements - this windows consists of the lowest 11 absolute values 
//		//in the sorted array. We can use PriorityQueue of size 11 scanning over these 22 elements. or use two pointer
//		// or use two pointers to find the sliding window of size 11
//		int no = Math.min(n, 11);
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int i = 0; i<a.length; i++) {
//			pq.offer(Math.abs(a[i]));
//			if(pq.size()>0)
//				pq.poll();
//			
//		}
//		int[] t = new int[no];
//		int c = 0;
//		while(!pq.isEmpty())
//			t[c++]=pq.poll();
//		
//		List<List<Integer>> ans=subsets(t);
//		List<Integer> sumL=new Vector<>();
//		for(List<Integer> l:ans) {
//			int S =0;
//			for(int x:l) S+=x;
//			sumL.add(S);
//		}
//		pq.clear();
//		for(int x:sumL) {
//			pq.offer(x);
//			int f=(neg==n)? k-1 :k;
//			if(pq.size()> f)
//				pq.poll();
//			
//		}
//		List<Long> result = new Vector<>();
//		while(!pq.isEmpty())
//			result.add(pq.poll()*1L);
//		Collections.sort(result,Comparator.reverseOrder());
//		System.out.println(result);
//		int[] finalResult = result.stream().mapToInt(Long::intValue).toArray();
//		return finalResult;
//	}
//	public static List<List<Integer>> subsets(int[] nums) {
//		List<List<Integer>> list = new ArrayList<>();
//		Arrays.sort(nums);
//		backtrack(list, new ArrayList<>(), nums, 0);
//		return list;
//	}
//	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start) {
//		list.add(new ArrayList<>(tempList));
//		for(int i = start; i < nums.length; i++) {
//			tempList.add(nums[i]);
//			backtrack(list, tempList, nums, i +1);
//			tempList.remove(tempList.size() -1);
//		}
//	}

	/*
	 *  HEllO TESTING ANOTHER ONE
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer k : ");
		int k = sc.nextInt();
		System.out.println("Please enter your popularity array length n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Please enter the list of songDurations: ");
		for(int i = 0; i < n; i ++) {
		a[i] = sc.nextInt();}
		
//		System.out.println(Arrays.toString(maxPopularity(a, k)));
		System.out.println(Arrays.toString(topKSum(a, k)));
		sc.close();
	}

}
