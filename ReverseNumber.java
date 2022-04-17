package testing;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		//int t = Integer.parseInt(bi.readLine());

		while(t--!=0){

		int num = sc.nextInt();
		//int num = Integer.parseInt(bi.readLine());
		int output = 0;
		int size = String.valueOf(num).length();

		for(int n=size-1; n>=0; n--){
			System.out.println("Math.pow(10,n) is: " + Math.pow(10,n));
		int q = (int)(num/Math.pow(10, n));
		System.out.println("q is:" + q);
		
		output +=  q * Math.pow(10, size-n-1);
		System.out.println("Math.pow(10, size-n-1) is: " + Math.pow(10, size-n-1));
		System.out.println("output is" + output);
		num = num % (int)Math.pow(10, n);
		System.out.println("num is : " + num);

		}
		System.out.println(output);
		
		//This is another way to reverse
		//BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		//int t = Integer.parseInt(bi.readLine());
		// while(t--!=0){
//	     String num = String.valueOf(sc.nextInt());
//	     StringBuilder sb = new StringBuilder(num);
//	     sb.reverse();
//	     num = sb.toString();
//	     System.out.println(Integer.parseInt(num));
	// }

		}}}