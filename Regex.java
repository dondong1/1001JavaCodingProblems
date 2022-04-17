package testing;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String IP = sc.next();
			System.out.println(IP.matches(new MyRegex().pattern));
			
		}
		sc.close();
	}

}
class MyRegex
{
	/*
	 * [01]?\\d{1,2} matches numbers 0-199.
	 * 2[0-4]\\d 	matches numbers 200-249
	 * 25[0-5] matches numbers 250-255
	 */
	
	String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5]|)";
	String pattern = num + "."+num+"."+num+"."+num;
	
}
