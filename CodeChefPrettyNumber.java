package testing;

import java.util.Scanner;

public class CodeChefPrettyNumber {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-->0) {
		        int[] nums = new int[2];
		        int count = 0;
		        for (int i = 0; i < 2; i++){
		            nums[i] = sc.nextInt();
		        
		        for (int j = nums[0]; j <=nums[1]; j++) {
		            if (Math.abs(j)%10 == 2 || Math.abs(j)%10 == 3 || Math.abs(j)%10 == 9) {
		                count ++;
		            }
		        }
		   }
		   System.out.println(count);
		        
		    }
		    
			// your code goes here
		}
	}