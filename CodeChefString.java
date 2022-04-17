package testing;

import java.util.Scanner;

public class CodeChefString {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0){
			    String x = sc.next();
			    if(x.equals("B") || x.equals("b")) {System.out.println("BattleShip");}
			    else if(x.equals("C") || x.equals("c")) {System.out.println("Cruiser");}
			    else if(x.equals("D") || x.equals("d")) {System.out.println("Destroyer");}
			    else if (x.equals("F") || x.equals("f")) {System.out.println("Frigate");}
			}
		}
	}
}