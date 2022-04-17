package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestStrings {
	static String[] solution(String[] inputArray) {
		List<String> a = new ArrayList<>();
		int[] b = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++) {
			b[i] = inputArray[i].length();
			System.out.println("Here is the array b");
			System.out.println(b);
		}
		Arrays.sort(b);
		int maxLength = b[b.length -1];
		System.out.println("here is the maxLength:" +maxLength);
		for (int j = 0; j < inputArray.length; j ++) {
			if(inputArray[j].length() == maxLength) {
				a.add(inputArray[j]);
				System.out.println("here is the list a: " + a);
			}
		}
		String[] result = a.toArray(new String[a.size()]);
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number n words in the list: ");
		int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i < n; i++){
        	System.out.println("Please enter the words in the list: ");
            arr[i] = sc.next();
        }
        System.out.println("Let me run the program: ");
        System.out.println(solution(arr));
        solution(arr);
        sc.close();

		
		// TODO Auto-generated method stub

	}

}
