package testing;

import java.util.Scanner;

public class IfElse {
	public static void main (String[] args) {
		System.out.println("Please enter an integer n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans ="";
		if (n%2 !=0) {
			ans = "Weird";
		}
		else {
			if(n%2 ==0 && n<5 && n >2) 
			{
			ans ="Not Weird";
			}
			else if(n%2 ==0 && n >= 6 && n<=20)
			{
			ans = "Weird";
			}
			else if (n%2 == 0 && n> 20)
			{
			ans= "Not Weird";
			}}
		System.out.println(ans);
		sc.close();
		
	}

}
