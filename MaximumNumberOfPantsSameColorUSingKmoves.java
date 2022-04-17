package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumNumberOfPantsSameColorUSingKmoves {
	//Input: Two integers N, K number of pants and maximum number of moves
	// String S consisting of uppercase English letter ith character 
	//from the beginning denotes the color of the ith layer of pants from top
	//Output:  A single line the maximum number of pants of the same color using almost K moves
	
	//Sample input : 5 2 ABACA --> out put 3 (See Codechef.com Problem Code: S03E02)
	//Explanation: 1st move: AB --> discard B add remaing --> AACA --> discard C
	
	//Logic:  1st: prefix [0,i] = P , 2nd: suffix [j, i] --> 3rd: P [0, j-1] + original string [i+1, n-1]
	//new string will be [0, j -1] [i+1, n-1]
	public static int solve(FastReader in) {
	int n = in.nextInt();
	int k = in.nextInt();
	String s = in.next();
	int res = 0;
	boolean allSame = true;
	int max = -1;
	for(int j =0; j<26; j++) {
//		String b = a;
//		int first_zero = -1;
//		int last_zero = -1;
//		for(int i =0; i<n; i++) {
//			if(a[i] == 'A' +j) {
				return 1;
			}
	return max;
		}
		
//	}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;

	        public FastReader() {
	            br = new BufferedReader(
	                    new InputStreamReader(System.in));
	        }

	        String next() {
	            while (st == null || !st.hasMoreElements()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int[] readArray(int n) {
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) a[i] = nextInt();
	            return a;
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }

	        long nextLong() {
	            return Long.parseLong(next());
	        }

	        double nextDouble() {
	            return Double.parseDouble(next());
	        }

	        String nextLine() {
	            String str = "";
	            try {
	                str = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }

}
