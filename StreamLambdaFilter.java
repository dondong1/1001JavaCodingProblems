package testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLambdaFilter {
	//Streams bring functional programming to Java, and are supported starting in java 8
	//will make you a more efficient java programmer
	//make heavy use of lambda expressions
	//parallelStreams make it very easy to multi-thread operations
	//Stream pipeline consits of a source, followed by zero or 
	//more intermediate operations; and a terminal operation.
	
	// source -> filter -> sort -> map -> collect
	
	//Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file
	//Intermediate operations: filter, map, sort return a stream.  We can chain multiple intermediate operations.
	
	//Terminal operations such as ForEach, collect, or reduce are either void or return a non stream result
	
	//zero or more intermediate operations are allowed.
	//order matters for large datasets: filter first then sort or map
	
	//very large datasets use ParallelStream to enable multiple thread.
	
	//Intermediate operations include: anyMatch(), flatmap(), distinct()
	//map(), filter(), skip(), findFirst9), sorted(), 
	
	//Only one terminal operation is allowed:
	//forEach applies the same function to each element, collect saves the elements into a collection
	//other options reduce the stream to a single sumary elemnt:
	// count(), min(), max(), reduce(), summaryStatistics();
	//a,b,c.. => Z;

	public static void main(String[] args) throws IOException {
		//1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
		
		//2. Integer Stream with skip
		IntStream
		.range(1,10)
		.skip(5)
		.forEach(x -> System.out.println(x));
		System.out.println();
		//3. Integer Stream with sum
		System.out.println(
				IntStream
				.range(1,5)
				.sum());
		System.out.println();
		//4.  Stream.of , sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		//5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Han"};
		Arrays.stream(names) //same as Streamof(names)
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);
		//6. Average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map(x -> x*x)
		.average()
		.ifPresent(System.out::println);
		//7. Stream from List, filter and print
		List<String> people =Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Han", "Shivia");
		people
		.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);
		//8. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands
		.sorted()
		.filter(x -> x.length() >13)
		.forEach(System.out::println);
		bands.close();
		System.out.println("**************");
		//9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
				.filter(x -> x.contains("jit"))
				.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x)); 
		System.out.println("**********");
		//10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int)rows1
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.count();
		System.out.println(rowCount + " rows.");
		rows1.close();
		//11 Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) >15 )
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows2.close();
		System.out.println("********");
		//12.  Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1])>15)
				.collect(Collectors.toMap(
						x -> x[0],
						x -> Integer.parseInt(x[1])));
		rows3.close();
		
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));}
		System.out.println(" ******************** ");
		//13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0, (Double a, Double b) -> a+b);
		System.out.println("Total = " +total);
		
		//14. Reduction - summary statistics only work for Integers
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
		System.out.println(summary);

	}

}
