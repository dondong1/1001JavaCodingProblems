package testing;

import java.util.Scanner;

public class isLuckySumOfFirstHalfVsSumOfSencondHalf {
	 static boolean solution(int n) {
	     String b = Integer.toString(n);

	        int sum1 =0;
	        int sum2 =0;
	     for(int i = 0; i< b.length()/2; i++) {
	         sum1 += b.charAt(i);
	      
	     }
	       for(int i = b.length()/2; i< b.length(); i++) {
	         sum2 += b.charAt(i);
	        
	     }
	     if(sum1 != sum2) return false;
	    else return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int n = sc.nextInt();
		System.out.println(solution(n));
		sc.close();

}
}
