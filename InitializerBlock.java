package testing;

import java.util.Scanner;

public class InitializerBlock {
	private static int B;
	private static int H;
	private static boolean flag;
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		sc.close();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Blah blah must be positive");
			flag = false;
		}
		else {
			flag = true;
		}
		
	}
	
	public static void main (String[] args) {
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}
	}

}
