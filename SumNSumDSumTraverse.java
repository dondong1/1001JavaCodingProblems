package testing;

import java.util.Scanner;

public class SumNSumDSumTraverse {
	//For example if D = 2 and N = 3 then sum(2, 3) equals to sum(sum(3)) = sum(1+2+3) = sum(6) = 21
	static int sum(int x) {
		int total = 0;
		for(int i = 0; i <= x; i++) {
			total =+i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int D = sc.nextInt();
		    int N = sc.nextInt();
		    int k = 1;
		    while(k<=D) {   
		    int sum = 0;
		    for(int i = 0; i <= N; i++) {
		        sum += i;
		    }
		    N = sum;
		    k++;
		    	}
		System.out.println("The normal way: " +N);
		int x = 0;
		for(int j = 0; j <= D; j++) {
			x = sum(N);
			x = N;	
		}
		System.out.println("The traverse way: " + x);
		
		}
	}}