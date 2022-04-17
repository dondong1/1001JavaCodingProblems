package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class StringPriorityQueueTopKFrequentPopularity {

	public static List<String> top_KFrequentPopularity(String[] words, int k) {
		//Intialize a map in order to get the frequencies
		Map<String, Integer> map = new HashMap<>();
		//Loops over all of our words and if the word is already in there, then take that value and append one.  
		// If not then default to zeo and add one as well.
		//So we use map.getOrDefault(word, 0) +1) 
		for (String word: words) {
			map.put(word, map.getOrDefault(word, 0) +1);
		}
		//After we initialize our map and got all of our frequencies 
		//we need to initialize our pirority queue and create custom comparator class
	PriorityQueue<String> prior = new PriorityQueue<>(new Comparator<String>(){
		@Override
		public int compare(String word1, String word2) {
				int frequency1 = map.get(word1);
				int frequency2 = map.get(word2);
				if(frequency1 == frequency2) return word2.compareTo(word1);
				return frequency1 - frequency2;
		}
	});
	//after we got the logic sorting, we need to loop over all of the entries in our map and start adding into our priority queue
	for (Map.Entry<String, Integer> entry: map.entrySet()) {
		// we need to add in the string inside of our priority queue
		prior.add(entry.getKey());
		//check the size of the queue - if the size of the queue is greater than k we need to poll (pull out) the top element
		if(prior.size() > k) prior.poll();}
	//At this point we want to return the result 
	List<String> result = new ArrayList<>();
	while(!prior.isEmpty()) result.add(prior.poll());
	//By this time all the strings inside the result are in reverse so we need to reverse it back
	Collections.reverse(result);
	
	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
