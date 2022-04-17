package testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

public class AmazonKMaxCombinationsSortedWay {
	//1.Sort both arrays array A and Array B
	//2.Create a max heap i.ex priority queue to store the sum combinations along with the 
	//indices of elements from both arrays A & B which make up the sum. Heap is ordered by the sum
	//3.Initialize the heap with the maximum possible sum combination 
	//i.e (A[N -} + B[N-1] where N is the size of array) 
	//and with the indices of elements from both arrays (N-1, N-1).  
	//The tuple inside max heap will be (A[N-1] + B[N-1], N-1, N-1) Heap is ordered by first value i.e sum of both elements
	//4. Pop the heap to get the current largest sum and along with the indices of the 
	//element that make up the sum. Let the tuple be (sum, i, j).
	//Next insert(A[i -1] + B[j], i -1, j) and (A[i] + B[j-1], i, j-1) into the max heap
	//but make sure that the pair of indices i.e (i -1, j) and (i , j-1) are not already present 
	//in the max heap.  
	//Go back to 4 until K times.
		public static void MaxPairSum(Integer[]A, Integer[] B, int N, int K)
		{
			// sort both arrays A and B
			Arrays.sort(A);
			Arrays.sort(B);
			// Max heap which contains Pair of 
			// the format (sum, (i,j)) i and j are 
			// the indices of the elements from
			//Array A and array B which make up the sum
			PriorityQueue<PairSum> sums = new PriorityQueue<PairSum>();
			//pairs is used to store the indices of the Pairs(i,j)
			//We use pairs to make sure the indices does not repeat inside max heap
			HashSet<Pair> pairs = new HashSet<Pair>();
			//initialize the heap with the maximum sum
			//combination ie (A[N-1] + B[N-1])
			//and also push indices (N-1, N-1) along with sum
			int l = N-1;
			int m = N -1;
			pairs.add(new Pair(l,m));
			sums.add(new PairSum(A[l] + B[m], l, m));
			//iterate upto K
			for (int i = 0; i  < K; i++) {
				//Poll the element from the 
				//maxheap in the format (sum, (l,m))
				PairSum max = sums.poll();
				System.out.println(max.sum);
				l = max.l -1;
				m = max.m;
				// insert only if l and m are greater
				// than 0 and the pair (l, m) is 
				//not already present inside set i.e
				//no repeating pair should be
				//present inside the heap
				if(l>=0 && m>=0 && !pairs.contains(new Pair(l,m))) {
					//insert (A[l] + B[m], (l, m))
					//in the heap
					sums.add(new PairSum(A[l]+B[m], l, m));
					pairs.add(new Pair(l,m));
				}
				l = max.l;
				m = max.m -1;
				//insert only if l and m are greater than 0
				//and the pair(l, m) is not already present inside
				//set i.e no repeating pair should be present inside the heap
				if(l >= 0 && m>= 0 && !pairs.contains(new Pair(l, m))) {
					//insert (A[l] + B[m], (l, m))
					// in the heap
					sums.add(new PairSum(A[l] + B[m], l, m));
					pairs.add(new Pair(l,m));
							
				}
			}
		}

	public static void main(String[] args) {
		Integer A[] = {1, 4, 2, 3};
		Integer B[] = {2, 5, 1, 6};
		int N = A.length;
		int K = 4;
		//Function call
		MaxPairSum(A, B, N, K);

	}
	public static class Pair {
		public Pair(int l, int m) {
			this.l = l;
			this.m =m;
		}
		int l;
		int m;
		@Override public boolean equals(Object o) {
			if (o == null) {
				return false;
			}
			if(!(o instanceof Pair)) {
				return false;
			}
			Pair obj = (Pair)o;
			return (l == obj.l && m == obj.m);
		}
		@Override public int hashCode()
		{
			return Objects.hash(l,m);
		}
	}
	public static class PairSum implements Comparable<PairSum> {
		public PairSum(int sum, int l, int m) {
			this.sum = sum;
			this.l = l;
			this.m = m;
		}
		int sum;
		int l;
		int m;
		@Override public int compareTo(PairSum o) {
			return Integer.compare(o.sum, sum);
		}
	}

}
