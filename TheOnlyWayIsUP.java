package testing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class TheOnlyWayIsUP {
	/*
	 * The only way is up
	 * A sequale arr[] is called a raising sequence if for each i>0, arri > arri+1
	 * Given a sequence and a positive integer B, you need to convert the sequence 
	 * into a raising sequence by adding an integer B into one or all of its elements, 
	 * any number of times.
	 * Your task is to find out the total number of times you need to add B to amek this
	 * a rising sequence
	 * For example consider the sequence 1, 5, 5, 4 and B =2, First you add 2 to the third
	 * element once to make the seuqence 1, 5, 7, 4 then you add 2 to the fourth element twice
	 * to make the sequence 1, 5, 7, 8 which is a rising sequence
	 * So the total number of times you add 2 to the sequences is 1 + 2 = 3
	 * 
	 */
	public static int solve(int B, List<Integer> arr) {
		int count = 0;

		for (int i = 0 ; i < arr.size()-1; i++) {
			for(int j = i+1; j < arr.size(); j++) {
				if(arr.get(i) < arr.get(j)) {continue;}
				else while (arr.get(i) >= arr.get(j)) {
				int newValue = arr.get(j);
				newValue +=B;
				count++;
				arr.set(j, newValue);
				
			}}
			
		}
		return count;
	}

	public static void main(String[] args) throws IOException{
		System.out.println(solve(2, Arrays.asList(1, 5, 5, 4)));
		System.out.println(solve(2, Arrays.asList(1, 5, 5, 4, 1)));
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty(null)));
//		bufferedWriter.write("\n");
//		bufferedWriter.close();
//		bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty(null)));
//		int B = Integer.parseInt(bufferedReader.readLine().trim());
//		int arCount = Integer.parseInt((bufferedReader.readLine().trim()));
//		List<Integer> ar = new ArrayList<>();
//		String[] artempItems = bufferedReader.readLine().replaceAll(null, null);
//		for (int i = 0; i < arCount; i ++) {
//			int arItem = Integer.parseInt(artempItems[]);
//			ar.add(arItem);
//		}
//		int outcome = Outcome.slove(B,ar);
//		bufferedWriter.write(outcome + "\n");
//		bufferedWriter.newLine();
//		bufferedReader.close();
//		bufferedWriter.close();
//		
		
		
		// TODO Auto-generated method stub

	}

}
