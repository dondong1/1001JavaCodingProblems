package testing;

import java.util.Scanner;

public class CodeChefTwoDish {

	public static void main(String[] args) 	{
		{
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-->0){
		         int N = sc.nextInt();
		         int A = sc.nextInt();
		         int B = sc.nextInt();
		         int C = sc.nextInt();
		         double  D = Math.ceil((double)N/2);
		        
		          if((B >= N && A >= D && B >= D) || (B >=N && A>= N) || (B >=N && C >= N) || (B >= N & (A+C) >= N)) System.out.println("YES");
		         else System.out.println("NO");
		    }
		}
	}}