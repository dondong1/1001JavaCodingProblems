package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChefMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int sum = A + B;
		    System.out.println("sum is " + sum);
		    int count = 0;
		    String[] digits = Integer.toString(sum).split("");
		   
		    System.out.println("digits is " +Arrays.asList(digits));
		    for(int i = 0; i < digits.length; i++){
		        if (digits[i].equals("0")) { count += 6;}
		        else if (digits[i].equals("1")) { count += 2;}
		        else if (digits[i].equals("2")) { count += 5;}
		        else if (digits[i].equals("3")) { count += 5;}
		        else if (digits[i].equals("4")) { count += 4;}
		        else if (digits[i].equals("5")) { count += 5;}
		        else if (digits[i].equals("6")) { count += 6;}
		        else if (digits[i].equals("7")) { count += 3;}
		        else if (digits[i].equals("8")) { count += 7;}
		        else if (digits[i].equals("9")) { count += 6;}
		        /*
		         * 		for(int i=0;i<test;i++){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = a+b;
		    int[] ar = {6,2,5,5,4,5,6,3,7,6};
		    int temp = c;
		    int sum = 0;
            do{
                  sum=sum + ar[(temp % 10)];
                  temp /= 10;
                    } while  (temp > 0);
                    
		    System.out.println(sum);
		         */
		    }
		    System.out.println(count);
		}
	}
}