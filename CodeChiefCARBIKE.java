package testing;

import java.util.Scanner;

public class CodeChiefCARBIKE {

	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			while(T --> 0) {
			int[] arr = new int[2];
			for (int i =0; i<2; i++) { arr[i] = sc.nextInt();}
				if (arr[0] < arr[1]) System.out.println("BIKE");
				else if (arr[0]> arr[1] ) System.out.println("CAR");
				else System.out.println("SAME");
			}
			sc.close();
			}}