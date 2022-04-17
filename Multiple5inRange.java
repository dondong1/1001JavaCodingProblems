package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Multiple5inRange {
	public static String codeHere(String inputData) {
	
		List<Integer> data = Arrays.asList(inputData.split(" ")).stream()
				  .map(s -> Integer.parseInt(s))
				  .collect(Collectors.toList());
		

		List<Integer> result = new ArrayList<>();

		for (int i = data.get(0); i <= data.get(1); i ++) {
			if(i%5 == 0) {
				result.add(i);
			}
			
		
		}
		if(result.isEmpty() == true ) {
			return "none";
		}
		else

		return result.stream().map(Object::toString).collect(Collectors.joining(" "));
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String inputData = sc.nextLine();


System.out.println(codeHere(inputData));

	}

}
