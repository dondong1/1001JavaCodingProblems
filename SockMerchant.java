package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		int num_pairs = 0;
		if(ar.length == 0) return num_pairs;
		
		Set<Integer> set = new HashSet();
		for (int i = 0; i < ar.length; i++) {
			if(!set.contains(ar[i])) {
				set.add(ar[i]);
			}
			else {
				num_pairs++;
				set.remove(ar[i]);
			}
		}
		return num_pairs;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int[] ar = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        System.out.println("The number of pairs of socks in the array is: "+sockMerchant(n, ar));
//
//        bufferedReader.close();
		
		System.out.println("Please enter the number n of elements (number of socks) in your array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Please enter the elements (color sock code) in your array:");
		int[] ar = new int[n];
		for(int i =0; i< n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("The number of pairs of socks in the array is: "+sockMerchant(n, ar));
		

    }
}
