package testing;

import java.util.Scanner;

public class CodeChefSumOfFirstandLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		int rem = 0;
		while(t-->0) {
			int a = sc.nextInt();
		
			sum = a%10;
			while(a>0) {
			
				rem = a%10;
				a = a/10;
			}
			sum = sum+rem;
			System.out.println(sum);
		}

	}

}
