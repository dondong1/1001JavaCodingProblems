package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class CountingValleys {
	static int countingVallings(int n, String s) {
	int altitude = 0;
	int num_valleys = 0;
	for(int i =0; i<n; i++) {
		if(s.charAt(i) == 'U') {
			if (altitude == -1) {
				num_valleys++;
			}
			altitude ++;
		}
		if(s.charAt(i) == 'D') {
			altitude --;
		}
	}
	return num_valleys;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter an integer n for the number of steps Gary takes: ");
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		 IntStream.range(0, n).forEach(tItr -> {
	            try {
	            	System.out.println("Please enter the n characters that describe the path: ");
	                String s = bufferedReader.readLine();
	                System.out.println("Your valley is: "+countingVallings(n, s));
	            }
	            catch (IOException ex) {
	            	throw new RuntimeException(ex);
	            			}
	      });
//		 while(testCases>0) {
//				String pattern = sc.nextLine();
//				try {
//					Pattern.compile(pattern);
//					System.out.println("Valid");
//				}
//				catch(PatternSyntaxException ex) {
//					System.out.println("Invalid");
//				}

	        bufferedReader.close();

}}
