package testing;

import java.util.Scanner;

public class JumpingClouds {
	public static int jumpingOnClouds(int[] c) {
		int len = c.length;
		int count = -1;
		for (int i =0; i<(len);) {
			if (i+2 < (len) && c[i+2] == 0) {
				i = i +2;
				
			}
			else {
				i++;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of cloud:");
		int n = sc.nextInt();
		System.out.println("Please enter the array of cloud:");
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();	
		}
		int ans = jumpingOnClouds(c);
		System.out.println(ans);
		sc.close();

		
	}

	
}
