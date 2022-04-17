package testing;

import java.util.Scanner;

public class DiagonalDifferencesFunction {
	static int diagonalDifference(int[] [] arr) {
		int left_to_right = 0;
		int right_to_left = 0;
		
		int rows = arr.length;
		int columns = arr[0].length;
		
		int i = 0;
		int j = 0;
		int k = 0; 
		int l = arr.length - 1;
		
		while (i < rows && j < columns && k < rows && l>=0) {
			left_to_right += arr[i][j];
			right_to_left += arr[k][l];
			i++; j++; k++; l--;
		}
		
		return Math.abs(left_to_right - right_to_left);
		
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
				System.out.println("Please enter an integer: ");
				int n = scanner.nextInt();
				System.out.println("Please enter the elements of the array: ");
				int[][] arr = new int [n][n];
				for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
				arr[i][j] = scanner.nextInt();
		
				System.out.println(diagonalDifference(arr));
				
		    
	}

}
