package testing;

import java.util.Scanner;
import java.time.LocalDate;

public class DateAndTime {
	public static String getDay(String day, String month, String year) {
		int d = Integer.parseInt(day);
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);
		LocalDate lt = LocalDate.of(y,m, d);
		return lt.getDayOfWeek().name();
	}
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		String day = in.next();
		String month = in.next();
		String year = in.next();
		System.out.println(getDay(day,month, year));
		
		
	}

}
