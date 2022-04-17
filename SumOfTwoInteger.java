
package testing;

import java.util.Scanner;

public class SumOfTwoInteger {
	static int sum2(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your first integer: ");
	int a = sc.nextInt();
	System.out.println("Please enter your second integer: ");
	int b = sc.nextInt();
	System.out.println("The sum of two given integers is : "+ sum2(a,b));
	


	}

}
