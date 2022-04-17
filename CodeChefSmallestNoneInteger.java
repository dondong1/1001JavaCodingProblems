package testing;

import java.util.Scanner;

public class CodeChefSmallestNoneInteger {

	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
			    int n = sc.nextInt();
			    int k = sc.nextInt();
		    if(n==0) System.out.println(n);
			    else System.out.println(n%k);
		}
	}}
