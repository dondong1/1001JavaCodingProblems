package testing;

import java.util.Scanner;

public class InfoSys {
  
	   public static boolean isValidPalindrome(String str) {
		   int len = str.length();
		   for(int i =0; i< len/2; i++) {
			   if(str.charAt(i) != str.charAt(len-i -1)) {
				   System.out.println("This is not a Palindrome");
				   return false;
			   }
		   }
		   return true;
	   }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please give me a string: ");
		String str = sc.next();
		System.out.println(isValidPalindrome(str));
		
	}

}
