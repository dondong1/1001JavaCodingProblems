package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChefAvgflex {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int m[] = new int[101];
				for(int i=0; i<n; i++) {
					m[sc.nextInt()]++;
				}
				int x = sc.nextInt();
				int scores[] = new int[101];
				for (int j = 0; j < x; j++) {
					scores[j]= sc.nextInt();
				}
			
				System.out.println(Arrays.toString(m));
				System.out.println(Arrays.toString(scores));
				int c = 0;
				int ans = 0;
				for(int i = 0; i < m.length; i++) {
					if(m[i]!=0 && c + m[i] > n -c - m[i])
		
						ans += m[i];
					c+=m[i];
				} System.out.println(ans);
				
			}

	}

}
