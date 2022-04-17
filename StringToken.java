package testing;

import java.util.Arrays;
import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		s = s.trim();
		System.out.println(s);
		System.out.println("*******");
		if(s.length() == 0) {
			System.out.println("0");
			return;
		}
		String[] words = s.split("[^a-zA-Z]+");
		System.out.println(words.length);
		System.out.println(Arrays.asList(words));
		for(String word : words) 
			System.out.println(word);
		
		
	}

}
