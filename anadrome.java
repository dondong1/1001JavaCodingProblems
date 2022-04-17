package testing;

import java.util.Scanner;

public class anadrome {
	static int solution(String word) {
		if(word == null|| word.length() ==0 ) {
			return 0;
		}
		int[] count = new int[26];
		for(char ch: word.toCharArray()) {
			count[ch - 'a']++;
			
		}
		int finalCount = 0;
		for (int i = 0; i<26; i++) {
			if(count[i] %2 !=0) {
				++finalCount;
			}
		}
		if(finalCount == 0) {return finalCount;}
		else
		return finalCount -1;
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word to check:");
	String word = sc.next();
	System.out.println(solution(word));
	sc.close();
	
 
	}

}
