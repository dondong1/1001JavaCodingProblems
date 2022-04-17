package testing;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AmazonMaxPopularity {
	/*
	 * Priority Queue is an abstract data type, which is similar to a queue, 
	 * however, in the priority queue, every element has some priority. 
	 * The priority of the elements in a priority queue determines the order in which elements are removed from the priority queue. 
	 * Therefore all the elements are either arranged in an ascending or descending order.
	 */
	 static PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));
	    public static int[] maxPopularity(int[] arr, int k){
	        //recursive call from the subsetSum method
	        subsetSum(arr,0,arr.length-1, 0);
	       
	        // Complexity PQ for polling is O(log(n))
	        int[] ans = new int[k];
	        System.out.println("intialize ans" + Arrays.toString(ans));
	        
	        int i = 0; 
	        System.out.println(pq);
	        
	        while(!pq.isEmpty() && i<k){
	            
	            ans[i] = pq.poll();
	            
	            i++ ; 
	        }
	        System.out.println("final ans" + Arrays.toString(ans));
	        return ans ; 
	    }
	    //We can recursively solve this problem.  There are total 2^n subsets.  
	    //For every element, we consider two choices, we include it in a subset and we don't include it in a subset.
	    //Then we have to use priority queue which take nlog(n) 
	    //Time complexity of this subsetSum is O(2^n) and space complexity is O(2^n)
	    //So the total time complexity of priority queue subset is O(k) ^for going through all k^  + O(log(n) ^ for priority queue sorting^  + O(2^n) ^for subsets
	    //O(k+log(n) +2^n)
	    public static void subsetSum(int[] arr, int l, int r, int sum){
	        //sums of all subsets of arr[l..r]
	    	//our recursive is stopped when it reached r
	        if(l>r){
	            pq.offer(sum); 
	            return ;
	        }
	        //recursion: function call by itself
	        //recursive call is when we call the method itself inside the method
	        //subset including arr[l]
	        subsetSum(arr,l+1,r,sum+arr[l]);
	        //subset excluding arr[l]
	        subsetSum(arr,l+1,r,sum);
	    
	        return  ; 
	        
	    }

	public static void main(String[] args) {
//		  System.out.println(Arrays.toString(maxPopularity(new int[]{3,5,-2},3)));
//	         System.out.println(Arrays.toString(maxPopularity(new int[]{0,-1,2},3)));
	         System.out.println(Arrays.toString(maxPopularity(new int[]{5,4,3},3)));
	      // [20 50 40 25 30 10] /60
	 		// [1, 10, 25 , 35, 60] 90 / [20 50 40 25 30 10 ] 90 / [50 20 10 40 25 30 ] 90 /
	 		// [1, 2] 90 / [0 0 0 ] 30/ [] 90

	    }
	}