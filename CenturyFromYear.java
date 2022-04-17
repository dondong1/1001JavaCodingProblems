package testing;

import java.util.Scanner;

public class CenturyFromYear {
	static int century(int year) {
		if(year<=0) {
			return 0;
		}
		else if(year <= 100) {
			return 1;
		}
		else if(year %100 ==0 )
		{
			return year/100;
			}
		else {
			return year/100 +1;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year:");
		int year = sc.nextInt();
		System.out.println("The century is: " + century(year));
		sc.close();
		

	}

}
