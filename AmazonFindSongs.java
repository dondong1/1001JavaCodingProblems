package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AmazonFindSongs {
	// brutal force way:
	// Complexity: for i = 0; inner loop will run N-1 times
	// for i = N-1, inner llop will run 0 times
	// So the toal number of times, the lines inside inner loop will be executed is
	// 0 + 1 + 2 +.... + (N-1) = (N-1)(N-2) /2.
	// The worst case time complexity of the algorithm become O(N^2)
	// Since we are not using extra data structure to store the input or any other
	// data temporarily in memory the space is constant.
	// Time Complexity: O(N^2) : Quadratic time complexity
	// Space Complexity: O(1) : Constant space
	public static List<Integer> findSongs(int rideDuration, List<Integer> songDurations) {
		List<Integer> result = Arrays.asList(-1, -1);

		if (songDurations == null || rideDuration <= 30) {
			return Arrays.asList(-1, -1);
		}

		int largest = 0;
		rideDuration -= 30;

		for (int i = 0; i < songDurations.size(); i++) {
			for (int j = i + 1; j < songDurations.size(); j++) {
				if ((songDurations.get(i) + songDurations.get(j) == rideDuration)
						&& (songDurations.get(i) > largest || songDurations.get(j) > largest)) {
					result.add(i);
					result.add(j);

					if (songDurations.get(i) > largest) {
						largest = songDurations.get(i);

					} else {
						largest = songDurations.get(j);

					}
					return result;
				}
			}
		}
		return Arrays.asList(-1, -1);
	}

	// HashMap way: Complexity : O(N)
	public static List<Integer> findSong2(int rideDuration, List<Integer> songDurations) {
		// In this algorithm we have traded time with space. We are traversing the array
		// linearly.
		// The worst-case scenerio for this algorithm is where we have to traverse the
		// whole array.
		// In the loop we doing constant work which is getting a value from map and
		// putting a value into map.
		// Time complexity: O(N): Linear time complexity
		// Space Complexity: O(N): Linear space complexity

		/*
		 * The interviewer may ask a follow up question - Can we optimize the solution
		 * if we are given a sorted array?
		 * 
		 * How can solve the problem for a sorted array in a more efficient way?
		 * Whenever a sorted array is given for any problem, we can think of 2
		 * approaches
		 * 
		 * - binary search
		 * 
		 * - 2-way scan For the input of size n, an algorithm of O(n) will perform steps
		 * proportional to n, while another algorithm of O(log(n)) will perform steps
		 * roughly log(n).
		 * 
		 * Clearly log(n) is smaller than n hence algorithm of complexity O(log(n)) is
		 * better. Since it will be much faster.
		 */
		// rideDuration minus 30 seconds will be the sum
		rideDuration -= 30;
		
		/*
		 * HashMap uses its static inner class Node<K,V> for storing the entries into the map.
		HashMap allows at most one null key and multiple null values.
		The HashMap class does not preserve the order of insertion of entries into the map.
		the Wrapper classes like Integer and String classes are a good choice for keys for HashMap
		 as they are immutable and their object state won’t change over the course of the execution of the program.
		 */
		// I use HashMap to store each element of the list songDurations as a Key of the map.
		//so then i can use containsKey to check for the key of the map whether equal to the complement
		Map<Integer, Integer> map = new HashMap<>();
		// I use List<Integer> result because the default method return List<Integer> as the indices of the required songs which 
		// durations are the keys in the map
		//I set the default result as list of -1, -1 because if we can't find any pair that met the requirement we need to return -1, -1
		List<Integer> result = Arrays.asList(-1, -1);
		int largest = 0;
		// Check if SongDurations has no song then return -1 -1
		if (songDurations == null) {
			return Arrays.asList(-1, -1);
		} else {
			// Iterate through the array and find the complement of each element (number)
			for (int i = 0; i < songDurations.size(); i++) {
				// complement equal the sum minus first song of the pair which is the key that we are checking if it is in the map
				int complement = rideDuration - songDurations.get(i);
				System.out.println("Your complement is: " +complement);
				// Check if the complement of current element is present in the map?
				// AND check if the current vallue is larger than largest then we reassign the
				//reassign the largest to the largest values of either current values or the complement.
				if ((songDurations.get(i) > largest || complement > largest) && map.containsKey(complement)) {
					// if the complement already exists as a key in the hashmap
					// return the corresponding value which is going to be an index along with
					// current index
					result.set(0, map.get(complement));
					result.set(1, i);
					//use Math.max to compare between the values current number and its complement
					// return the largest value between them
					largest = Math.max(songDurations.get(i), complement);
				}
				//if the complement does not already exist as a key in the hashmap, 
				//store our current number along with our current index in our hashmap 
				map.put(songDurations.get(i), i);
				System.out.println(map);
			}
		}
		return result;

	}

	// The two pointers method can improve a little more - because we don't even go
	// through the whole array
	//

	public static List<Integer> leftRight(int rideDuration, List<Integer> songDurations) {
		List<Integer> result = new ArrayList<Integer>();
		int largest = 0;
		if (songDurations == null || rideDuration <= 30) {
			return Arrays.asList(-1, -1);
		}
		rideDuration -= 30;
		int left = 0;
		int right = songDurations.size() - 1;

		while (left < right && left >= 0 && right < songDurations.size()) {
			int currentRideDuration = songDurations.get(left) + songDurations.get(right);
			if (currentRideDuration > rideDuration) {
				// if the sum of left and right elements is more than the given sum,
				// we need to decrease the currentRideDuration
				right--;

			} else if (currentRideDuration < rideDuration) {
				// if the sum of left and right elements is less than the given sum
				// we need to increase the currentRideDuration
				left++;
			} else {
				// if the sum of left and right elements is neither greater nor smaller than the
				// given sum, it must be equal

				largest = Math.max(songDurations.get(left), songDurations.get(right));
				return Arrays.asList(left, right);
			}
		}
		// if we reach here that means we could not find any pair which adds up to given
		// sum
		return Arrays.asList(-1, -1);
	}

	public static List<Integer> pairWithSum(int rideDuration, List<Integer> songDurations) {

		int n = songDurations.size();
		if (n == 0 || n == 1 || rideDuration <= 30)
			return Arrays.asList(-1, -1);
		Map<Integer, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int firstindex = -1;
		int secondindex = -1;
		rideDuration -= 30;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(rideDuration - songDurations.get(i))) {
				if (max < rideDuration - songDurations.get(i) || max < songDurations.get(i)) {
					max = Math.max(songDurations.get(i), rideDuration - songDurations.get(i));
					firstindex = map.get(rideDuration - songDurations.get(i));
					secondindex = i;
				}
			} else {
				map.put(songDurations.get(i), i);
			}
		}
		if (firstindex != -1 && secondindex != -1)
			return Arrays.asList(firstindex, secondindex);

		return Arrays.asList(firstindex, secondindex);
	}
	
	/*    
	 * This is the next Amazon maxPopularity problem:
	 */

	
	public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));

	public static int[] maxPopularity(int[] arr, int k) {

		subsetSum(arr, 0, arr.length - 1, 0);
		int[] ans = new int[k];
		int i = 0;
		while (!pq.isEmpty() && i < k) {
			ans[i] = pq.poll();
			i++;
		}
		return ans;
	}

	public static void subsetSum(int[] arr, int l, int r, int sum) {
		if (l < r) {
			pq.offer(sum);
			return;

		}
		subsetSum(arr, l + 1, r, sum + arr[1]);
		subsetSum(arr, l + 1, r, sum);
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter int rideDuration: ");
		int rideDuration = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> songDurations = new ArrayList<>(n);
		System.out.println("Please enter the list of songDurations: ");
		for (int i = 0; i < n; i++) {
			songDurations.add(sc.nextInt());
		}

//		System.out.println("Here is your answer: " + findSongs(rideDuration, songDurations));
		System.out.println("Here is your answer: " + findSong2(rideDuration, songDurations));
//		System.out.println("Here is your answer: " + leftRight(rideDuration, songDurations));
//		System.out.println("Here is your answer: " + pairWithSum(rideDuration, songDurations));


		
// [20 50 40 25 30 10] /60
		// [1, 10, 25 , 35, 60] 90 / [20 50 40 25 30 10 ] 90 / [50 20 10 40 25 30 ] 90 /
		// [1, 2] 90 / [0 0 0 ] 30/ [] 90
	}
}
