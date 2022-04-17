package testing;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class countNumberInRange {
	public static void main(String[] args)  {
//		String inputData = "";
//		String thisLine = null;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while((thisLine = br.readLine()) !=null) {
//			inputData += thisLine + "\n";
//
//		}
//
//		System.out.println(codeHere(inputData));
//		
//		}
				Scanner sc = new Scanner(System.in);

				String inputData = sc.nextLine();


				System.out.println(codeHere(inputData));
				sc.close();

					}

	static int single(int k, int n) {
		 int count = 0;
		    while (n > 0)
		    {
		    	
		    	
		        if (n % 10 == k)
		        count++;
		 
		        n = n / 10;
		    }
		    return count;
		}
	static int range(int k, int n)
	{
	     
	    // Initialize result
	    int count = 0;
	 
	    for (int i = 2; i <= n; i++)
	    count += single(k, i);
	    if(count ==0) {
	    	return 0;
	    }
	    else
	 
	    return count;
	}
	public static String codeHere(String inputData) {
	List<Integer> data =	Arrays.asList(inputData.split(" ")).stream()
		  .map(s -> Integer.parseInt(s))
		  .collect(Collectors.toList());
	int k = data.get(0);
	int n = data.get(1);
	System.out.println("This is the value of data:" + data);
	System.out.println("This is the result from data: " + String.valueOf(range(k,n)));
//	return String.valueOf(range(k,n));

				String[] values = inputData.split(" ");
				int[] m = new int[values.length];
				for (int i = 0; i < values.length; i++) {
					String a = values[i];
					m[i] = Integer.parseInt(values[i].trim());
				}
				System.out.println("This is the value of m: " + Arrays.toString(m));
				int x = m[0];
				int y = m[1];
				System.out.println("This is the result from m: " + String.valueOf(range(x,y)));
				
				return String.valueOf(range(x,y));
		
//		String a = String.valueOf(inputData.indexOf(0));
//		int k = Integer.parseInt(a);
//		System.out.println(k);
//		String b = String.valueOf(inputData.indexOf(1));
//		int n = Integer.parseInt(b);
		
	
	
		
	}	
	
		}
