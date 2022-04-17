package testing;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}

}
