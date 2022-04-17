package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CommonCharacterCount {
	static int solution(String s1, String s2) {
	int []freq1 = new int[26];
    int []freq2 = new int[26];
    Arrays.fill(freq1, 0);
    Arrays.fill(freq2, 0);
 
    // To store the count of valid pairs
    int i, count = 0;
 
    // Update the frequencies of
    // the characters of string s1
    for (i = 0; i < s1.length(); i++)
        freq1[s1.charAt(i) - 'a']++;
 
    // Update the frequencies of
    // the characters of string s2
    for (i = 0; i < s2.length(); i++)
        freq2[s2.charAt(i) - 'a']++;
 
    // Find the count of valid pairs
    for (i = 0; i < 26; i++)
        count += (Math.min(freq1[i], freq2[i]));
 
    return count;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter first word: ");
		String s1 = sc.next();
		System.out.println("Please enter second word: ");
		String s2 = sc.next();
		int result = solution(s1, s2);
		System.out.println(result);
		sc.close();

}
}
