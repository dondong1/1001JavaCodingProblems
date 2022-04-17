package testing;

import java.util.Scanner;

public class SumTwoNumbers {
	static int sum(int param1, int param2) {
		return param1 + param2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int param1 = sc.nextInt();
		int param2 = sc.nextInt();
		System.out.println(sum(param1, param2));
		
		
		
	}

}
