package testing;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		String n = sc.nextLine();
		BigInteger n = new BigInteger(scanner.next());
		
		
		scanner.close();
		System.out.println(n.isProbablePrime(1999999999)?"prime" : "not prime");
	}

}
