package testing;

import java.util.Scanner;

public class LongestCommonPrefix {
	static String longestCommon(String[] s) {
		// initialize the return answer
		String longestCommonPrefix = "";
		//error checking
		if(s == null || s.length == 0) {
			return longestCommonPrefix;
		}
		
		int index = 0;
		//checking every single character in the first string of s
		for (char c: s[0].toCharArray()) {
			// next comparing to every character in the other strings of s
			for (int i = 1; i < s.length; i++) {
				//if out of bound or not matching then stop
				if(index >= s[i].length() || c != s[i].charAt(index)) {
					return longestCommonPrefix;
					
				}
			}
			// otherwise add the common character into the answer
			longestCommonPrefix += c;
			index++;
			
			
		}
		return longestCommonPrefix;
	}

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int T = sc.nextInt();
	int n = sc.nextInt();
	String[] s = new String[n];
	while (T -->0) {
		for (int i = 0; i < n; i++) {
			 s[i] = sc.nextLine();
			System.out.println(longestCommon(s));
			
		}
	}
	

	}

}
