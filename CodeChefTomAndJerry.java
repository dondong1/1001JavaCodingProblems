package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeChefTomAndJerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   
		    FastScanner sc = new FastScanner();
		    int t = sc.nextInt();
		    while(t-->0) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        int d = sc.nextInt();
		        int K = sc.nextInt();
		        int dist = Math.abs(a-c) + Math.abs(b-d);
		        if(K == dist) System.out.println("YES");
		        else if(K < dist) System.out.println("NO");
		        else if(K%2 == dist %2) System.out.println("YES");
		        else System.out.println("NO");
		    }}

	/*..... */
			static class FastScanner {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer("");

			public String next() {
				while (!st.hasMoreElements())
					try {
						st = new StringTokenizer(br.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
				return st.nextToken();
			}

			int nextInt() {
				return Integer.parseInt(next());
			}

			int[] readArray(int n) {
				int[] a = new int[n];
				for (int i = 0; i < n; i++)
					a[i] = nextInt();
				return a;
			}

			long nextLong() {
				return Long.parseLong(next());
			}
		}
	}
