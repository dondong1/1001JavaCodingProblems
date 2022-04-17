package testing;

public class PalindromesLongestSubstring {
	static void printSubStr(String str, int low, int high)
	{
	    for (int i = low; i <= high; ++i)
	        System.out.print(str.charAt(i));
	}
	 
	
	static int longestPalindromeSubstr(String str) {
		// get the length of input String

		
		//All subStrings of length 1 are Palindromes
		int maxLength =1, 
				start = 0;
		
		//Nested loop to mark start and end index
		for(int i = 0; i< str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;
				//Check palindrome
				for (int k = 0; k < (j -i +1)/2 ; k++) 
					if(str.charAt(i+k) != str.charAt(j-k))
						flag = 0;
				//Palindrome
				if(flag!=0 && (j-i +1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
					
				}
					
			}
		}
		System.out.print("Longest palindrome subString is: ");
	    printSubStr(str, start, start + maxLength - 1);
	 
	    // return length of LPS
	    return maxLength;
		
	}
	public static void main(String[] args) 
		{
		    String str = "forgeeksskeegfor";
		    System.out.print("\nLength is: "
		         + longestPalindromeSubstr(str));
		}
		}
		 
