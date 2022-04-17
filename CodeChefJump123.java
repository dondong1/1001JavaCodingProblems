package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChefJump123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		System.out.println(check(a) ? "yes":"no");
	}
		static boolean check(long a) {
			return Arrays.asList(0, 1, 3).contains((int) (a%6));
		}

	}


