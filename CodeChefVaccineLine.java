package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeChefVaccineLine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0) {
			   int N = Integer.parseInt(br.readLine());
			   int P = Integer.parseInt(br.readLine());
			   int X = Integer.parseInt(br.readLine());
			   int Y = Integer.parseInt(br.readLine());
			   int[] line = new int[N];
			   int ans = 0;
			   for(int i = 0; i < N; i++) {
			       line[i] = Integer.parseInt(br.readLine());}
			    for (int j = 0; j< P; j++) {
			       if(line[j] == 0) ans += X;
			       else if (line[j] == 1) ans += Y;
			   }
			   System.out.println(ans);
			}
		}
	}
