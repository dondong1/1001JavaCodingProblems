package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;




public class LuckBalance {
	static int luckBalance(int k, List<List<Integer>> contests) {
		int luck_balance = 0;
		Collections.sort(contests, new Comparator<List<Integer>>() {
			public int compare(List<Integer> a, List<Integer> b) {
				return -1 * Integer.compare(a.get(1), b.get(1));
			}
		});
		
		for(int i =0; i<contests.size(); i++ ) {
			int luck = contests.get(i).get(0);
			int importance = contests.get(i).get(1);
			
			System.out.println("luck");
			System.out.println(luck);
			System.out.println("importance");
			System.out.println(importance);
			
			if(importance == 1 && k>0 ) {
				k--;
				luck_balance += luck;
			
			}
			else if (importance == 1 && k == 0) {
				luck_balance += luck;
			}
			if (importance == 0) {
				luck_balance += luck;
			}
			
		}
		return luck_balance;
		
	}

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter an integer n: ");
//		int n = sc.nextInt();
//		System.out.println("Please enter the max number of important contest: ");
//		int k = sc.nextInt();
//		System.out.println("Please enter the elements of array L and array T: ");
//		int[][] contests = new int[n][n];
//		for (int i=0; i<n; i++)
//		for (int j = 0; j < n; j++)
//		contests [i][j] = sc.nextInt();
//		sc.close();
//
//		System.out.println(luckBalance(k, contests));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println("please enter n:");
        int n = Integer.parseInt(firstMultipleInput[0]);
        System.out.println("please enter k:");
        int k = Integer.parseInt(firstMultipleInput[1]);
        System.out.println("Please enter the arrays:");
        List<List<Integer>> contests = new ArrayList<>();    
        
        IntStream.range(0,n).forEach(i-> {
        try {
            	 contests.add(
                         Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                             .map(Integer::parseInt)
                             .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int result = luckBalance(k, contests);    	
        System.out.println("here is the result:"+ String.valueOf(result));
     
        bufferedReader.close();
		
	}

}
