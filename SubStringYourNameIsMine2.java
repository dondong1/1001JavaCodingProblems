package testing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubStringYourNameIsMine2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    String M = sc.next();
		    String W = sc.next();
		    for(int i = 0; i < M.length(); i++) {
		    	for (int j = 0; j< W.length(); j++) {
		    		if (M.charAt(i) == W.charAt(j)) {
		    			i++;
		    			j++;
		    			
		    		}
		    	}
		    }
		    
		    		
		    	}
		    }
		    
		}
	

