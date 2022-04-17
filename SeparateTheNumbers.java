package testing;

import java.util.Scanner;

public class SeparateTheNumbers {
	public static void separateNumbers(String s) {
	    // Write your code here

			String sub = "";
	        boolean isValid = false;
	        //Check every possible substring up to the mid length 
	        for (int i = 1; i <= s.length() / 2; i++) {
	        	//set the substring as the first element 
	            sub = s.substring(0, i);
	            //save substring so we can use it later
	            long num = Long.parseLong(sub);
	            //set the substring as a valid string
	            StringBuilder valid = new StringBuilder(sub);
	            //increment the valid and add to the valid string 
	            while (valid.length() < s.length()) {
	                valid.append(++num);
	            }
	            //break once valid string is equal 
	            if (s.equals(valid.toString())) {
	                isValid = true;
	                break;
	            }
	        }
	        System.out.println(isValid ? "YES " + sub : "NO");
	       
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();
			separateNumbers(s);
		}

		scanner.close();
	}
}
