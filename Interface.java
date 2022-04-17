package testing;

interface Sum {
	int sum(int n);
}

public class Interface {
	static class MyCalculator implements Sum {
		public int sum(int n) {
			int sum = 0;
			for (int i = 1; i <= n; i ++) {
				sum = i++;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
