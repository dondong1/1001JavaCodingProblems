package testing;

import java.util.Scanner;

public class InOut2 {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter an integer:");
		int n = sc.nextInt();
		System.out.println("Please enter next double:");
		Double m = sc.nextDouble();
		System.out.println("Please enter next string: ");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println(s);
		System.out.println(m);
		System.out.println(n);
		sc.close();
	}

}
