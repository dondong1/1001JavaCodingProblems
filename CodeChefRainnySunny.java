package testing;

import java.util.Scanner;

public class CodeChefRainnySunny {

	public static void main(String[] args) {
		{   //Open a new Scanner
			Scanner sc = new Scanner(System.in);
			// initialize number test cases t equal to scanner input
			System.out.println("Please enter the number of test cases: ");
			int t = sc.nextInt();
			// we test until the last test case t
			while(t-->0) {
			    //intilize an array weather of 7 number
			    int[] weather = new int[7];
			    //initialize sumSunny
			    int sumSunny = 0;
			    //initialize sumRainny
			    int sumRainny =0;
			    //Make a loop so the scanner will take in information for 7 days
			    for(int i = 0; i<7; i++) {
			        System.out.println("Please enter 0 for rainny days OR 1 for sunny days: ");
			    	weather[i] = sc.nextInt();
			            if(weather[i] == 0){sumRainny++;}
			            if(weather[i] == 1) {sumSunny++;}
			        }
			        //compare and return the result by printing out as requested
			   	if(sumSunny > sumRainny){ System.out.println("YES");}
			    else {System.out.println("NO");}
			   
			    }
			    

			}
			
		}}