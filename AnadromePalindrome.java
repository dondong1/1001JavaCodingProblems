package testing;

import java.util.Scanner;

public class AnadromePalindrome {
	static int countReduce(String word) {
		int[] count = new int[26];
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			count[ch- 'a']++ ;
		}
		int oddOccur = 0;
		for(int cnt:count) {
			if(cnt%2 !=0)
				oddOccur++;
		}
		return oddOccur -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word to check:");
		String word = sc.next();
		System.out.println(countReduce(word));
		sc.close();
		

		}

	}