package testing;

public class IsLaddDivision {

	public static boolean isLadderDivision( int[] items) {
		if(items.length == 0) {
			return false;
		}
		int len = items.length/2;
		if(items.length %2 != 0) {
			len = len +1;
		}
		for (int i = 0; i <len; i++) {
			int divisor = len -i;
			if(items[i] % divisor != 0 || items[items.length -1 -i] % divisor !=0 ) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] items = {6,8,4,2,-26,12};
System.out.println(isLadderDivision(items));
	}

}
