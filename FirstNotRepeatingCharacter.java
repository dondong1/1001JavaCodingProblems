package testing;

public class FirstNotRepeatingCharacter {
	char firstNotRepeat(String s) {
		int[] char_counts = new int[26];
		for (char c : s.toCharArray()) char_counts[c - 'a']++;
		for (char c: s.toCharArray()) {
			if(char_counts[c - 'a']==1) return c;
		}
		return '_';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
