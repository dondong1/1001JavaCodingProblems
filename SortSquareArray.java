package testing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortSquareArray {
	static int[] sortedSquaredArray(int[] array) {
		int[] square = new int[array.length];
		for (int i = 0; i< array.length; i++) {
			square[i] = array[i] * array[i];
		}
		Arrays.sort(square);
		return square;
		
		
	}
	// TreeSet is cool but it will eliminate duplicate elements which we don't want.  So don't use this
		static TreeSet<Integer> treeSetWay(int[] array) {
			TreeSet<Integer> square2= new TreeSet<Integer>();
			for (int i = 0; i< array.length; i++) {
				square2.add( array[i] * array[i]);
			}
			
			return square2;
			
		}
	
	static int[] betterWay(int[] array) {
		int[] result = new int[array.length];
		int left = 0;
		int right = array.length -1;
		for(int i = 0; i<array.length; i ++) {
			if(Math.abs(array[left]) > array[right]) {
				result[i] = array[left] * array[left];
				left++;
				
			}else {
				result[i] = array[right] * array[right];
				right--;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[n];
		while(T --> 0) {
			for (int i = 0; i <n; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(sortedSquaredArray(array)));
			System.out.println("    betterWay      ");
			System.out.println(Arrays.toString(betterWay(array)));  
			System.out.println("    treeSetWay  - It will eleminate duplicate elements    ");
			System.out.println(treeSetWay(array));
//	
		}
		sc.close();

	}

}
