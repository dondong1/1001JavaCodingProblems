package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleBy3ButNot9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		{ BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int t = Integer.parseInt(br.readLine());
		    while(t -->0) {
		        int n = Integer.parseInt(br.readLine());
		        if(n==1) {
		            System.out.println(3);
		        }
		        else if(n ==2) {
		            System.out.println(15);
		        } else {
		            StringBuilder sb = new StringBuilder();
		            sb.append("3");
		            for(int i = 1; i < n-1; i++) {
		                sb.append("0");
		            }
		            sb.append("3");
		            System.out.println(sb);
		        }
		    }
		}
	}}
		