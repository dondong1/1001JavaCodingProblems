package testing;


public class TestString extends Welcome{

//	public static int solve(int n, int m) {
//		int[] arr = new int[n];
//		int a = minSteps(arr, n);
//		if(a%m == 0) return a;
//		else return a+1;
//		
//	}
//	public static int minSteps(int[] arr, int n){
//		
//		if(arr[n]==0) {
//			arr[n] = 1 + Math.min(minSteps(arr, n-1), minSteps(arr, n-2));
//		}
//		return arr[n];
//	}
//	

	public static void main(String[] args) {
		
	String a = "abc";
	String b = "abc";
	String c = new String ("abc");
	if(a == c && a.equals(b)) {
		System.out.println("they are equal");
	}
	else if(a == c) System.out.println("they are == ");
	else if(a.equals(c))System.out.println("They are .equals ");
	else System.out.println("They are not ");
	String river = new String("Columbia");
	System.out.println(river.length());
//	System.out.println(solve(10, 2));
//	System.out.println(solve(3,5));
//	System.out.println(solve(101, 3));
	}

private static void welcome1() {
	// TODO Auto-generated method stub
	
}

}
