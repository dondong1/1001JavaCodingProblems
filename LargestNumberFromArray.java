package testing;

public class LargestNumberFromArray {
	static int largest(int[] a) {
	
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]> largest) {
				largest = a[i];
				
			}
		}return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4 ,5};
		System.out.println(largest(a));
	}

}
