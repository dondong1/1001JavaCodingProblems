package testing;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChefIPSCCert {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int K = sc.nextInt();
		    int t = N;
		    int count = 0;
		    while (t -->0) {
		    	int iCompare = 0;
		    	for(int j = 0; j< K; j++) {
		    		int temp = sc.nextInt();
		    		iCompare+= temp;
		    	}
		    	int Qi = sc.nextInt();
		    	if(Qi <=10 && iCompare >= M) {
		    		count++;
		    	}
		    }
	        System.out.println(count);
		}
	}}
