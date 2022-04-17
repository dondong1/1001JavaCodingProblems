package testing;

import java.util.Scanner;

public class CommonChild {

	public static int common(String s1, String s2) {
		return getResult(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
	}
		public static int getResult(char[] X, char[] Y, int m, int n) {
			int memo [] = new int [n +1];
			for (int i =1; i <= m; i++) {
				int prev = 0;
				for (int j = 1; j <=n; j++) {
					int temp = memo[j];
					if (X[i-1] == Y[j-1]) {
						memo[j] = prev + 1;
					} 
					else {
						memo[j] = Math.max(memo[j], memo[j -1]);
					}
					prev = temp;
				}
			}
			return memo[n];
		}
		
	
	
	
	
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter first word: ");
	String s1 = sc.next();
	System.out.println("Please enter second word: ");
	String s2 = sc.next();
	int result = common(s1, s2);
	System.out.println(result);
	sc.close();
	
	
	
	
	
	
}

}
