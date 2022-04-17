package testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortStringComparator {
	static class SortStringComparatorMethod implements Comparator<String>{
		public int compare(String x, String y) {
			if(x.length() == y.length()) {
				return x.compareTo(y);
			}
			return x.length() - y.length();
		}
	}

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        StringBuilder out = new StringBuilder();
	        int n = in.nextInt();
	        String[] arr = new String[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.next();
	        }

	        Arrays.sort(arr, new SortStringComparatorMethod());

	        for (int i = 0; i < arr.length; i++) {
	            out.append(arr[i].toString() + "\n");
	        }

	        System.out.println(out.toString());

	    }
	}