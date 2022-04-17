package testing;

import java.util.Scanner;

public class Loops {
	public static void main (String[] args) {
		System.out.println("Please enter any integer number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for (int i = 1; i <=10; i++) {
			int b = a * i;
			System.out.printf("%d x %d = %d\n", a, i, b);
		}
	}

}
