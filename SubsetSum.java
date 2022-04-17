package testing;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SubsetSum {
	
	 
	 static PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));
		    public static PriorityQueue<Integer> subsetSum(int[] arr, int l, int r, int sum){
		        r = arr.length -1;
		        if(l>r){
		        
		            pq.offer(sum); 
		            System.out.println("original pq: " + pq);
		            return pq;
		        }
		        
		        
		        subsetSum(arr,l+1,r,sum+arr[l]);
		        System.out.println(Arrays.toString(arr));
		        System.out.println("l is:" +l);
		        System.out.println("r is :" +r);
		        System.out.println("sum is:" +sum);
		        System.out.println("arr[l] is : " + arr[l]);
		        System.out.println(sum+arr[l]);
		        System.out.println("New pq: " + pq);
		        subsetSum(arr,l+1,r,sum);
		        System.out.println("Newest pq: " + pq);
		       
		        return  pq; 
		        
		    }
	public static void main(String[] args) {
		  int[] arr = {3, 5, -2};
		  int l = 0;
		  int r = 0;
		  int sum = 0;
		  System.out.println(subsetSum(arr, l, r, sum));

	}

}
