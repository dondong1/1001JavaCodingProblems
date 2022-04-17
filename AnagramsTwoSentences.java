package testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class AnagramsTwoSentences {
	private static char[] sort(char[] s) {
		Arrays.sort(s);
		return s;
	}
	public static boolean nestedAnagram(String s, String t) {
		
		if (s.startsWith("\\s") || t.startsWith("\\s") || s.endsWith("\\s")
				|| t.endsWith("\\s") || s.isEmpty() || t.isEmpty())
		{
			return false;
		} else {
			HashMap<String, char[]> map = new HashMap<>();
			String[] sLists = s.split("\\s");
			String[] tLists = t.split("\\s");
			for (String s1: sLists) {
				if(!map.containsKey(s1)) {
				map.put(s1, sort(s1.toCharArray()));
			}
		}
		int keySize =  map.size();
		int finalAnswer = 0;
		for (java.util.Map.Entry<String, char[]> m:map.entrySet()) {
			for (String t2: tLists) {
				if(m.getKey().length() == t2.length()) {
					if(Arrays.equals(m.getValue(), sort(t2.toCharArray()))) {
						finalAnswer++;
					}
				}
			}
		}
	
	return (finalAnswer == keySize ? true:false);
		}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		boolean result = nestedAnagram(a, b);
		System.out.println(result);
	}

}
