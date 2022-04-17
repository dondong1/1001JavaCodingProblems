package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringYourNameIsMine {
	public static boolean s1Containess2(String s1, String s2) {
		int i = 0; int j = 0;
		while(i<s1.length() && j < s2.length()) {
			if(s1.charAt(i) == s2.charAt(j)) {
				i++; j++;
			}
			else {
				i++;
			}
		}
		return s2.length() == j;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	StringBuffer opBfr = new StringBuffer();
	while(t -->0) {
		String mk[] = br.readLine().split(" ");
		String w = mk[0];
		String m = mk[1];
		String op = "NO";
		
		if(m.length() >= w.length() && s1Containess2(m,w))
			op = "YES";
		else if (w.length() >= m.length() && s1Containess2(w, m))
			op = "YES";
		
		opBfr.append(op + "\n");
	}
	System.out.println(opBfr);

	}

}
