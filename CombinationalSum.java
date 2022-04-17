package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of positive integers arr[] and a sum x,
 *  find all unique combinations in arr[] where the sum is equal to x. 
 *  The same repeated number may be chosen from arr[] unlimited number of times. 
 *  Elements in a combination (a1, a2, …, ak) 
 *  must be printed in non-descending order. (ie, a1 <= a2 <= … <= ak). 
The combinations themselves must be sorted in ascending order, i.e., 
the combination with smallest first element should be printed first. 
If there is no combination possible the print “Empty” (without quotes).
Input : arr[] = 2, 4, 6, 8 
            x = 8
Output : [2, 2, 2, 2]
         [2, 2, 4]
         [2, 6]
         [4, 4]
         [8]
 */
public class CombinationalSum {

	/*
	 * Since the problem is to get all the possible results, not the best or the number of result, 
	 * thus we don’t need to consider DP(dynamic programming), recursion is needed to handle it.
	 * We should use the following algorithm. 

1. Sort the array(non-decreasing).
2. First remove all the duplicates from array.
3. Then use recursion and backtracking to solve 
   the problem.
   (A) If at any time sub-problem sum == 0 then 
       add that array to the result (vector of 
       vectors).
   (B) Else if sum is negative then ignore that 
       sub-problem.
   (C) Else insert the present index in that 
       array to the current vector and call 
       the function with sum = sum-ar[index] and
       index = index, then pop that element from 
       current index (backtrack) and call the 
       function with sum = sum and index = index+1
	 */
	static ArrayList<ArrayList<Integer> >
    combinationSum(ArrayList<Integer> arr, int sum)
    {
        ArrayList<ArrayList<Integer> > ans
            = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
 
        // first do hashing since hashset does not always
        // sort
        //  removing the duplicates using HashSet and
        // Sorting the arrayList
 
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
 
        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }
 
    static void
    findNumbers(ArrayList<ArrayList<Integer> > ans,
                ArrayList<Integer> arr, int sum, int index,
                ArrayList<Integer> temp)
    {
 
        if (sum == 0) {
 
            // Adding deep copy of list to ans
 
            ans.add(new ArrayList<>(temp));
            return;
        }
 
        for (int i = index; i < arr.size(); i++) {
 
            // checking that sum does not become negative
 
            if ((sum - arr.get(i)) >= 0) {
 
                // adding element which can contribute to
                // sum
 
                temp.add(arr.get(i));
 
                findNumbers(ans, arr, sum - arr.get(i), i,
                            temp);
 
                // removing element from list (backtracking)
                temp.remove(arr.get(i));
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
