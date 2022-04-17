package testing;

import java.util.HashMap;

public class DesignSearchAutoCompleteSystem {
//Design a search autocomplete system for a search engine.  Users may input a sentence
	//For each character they type except'#' you need to return top 3 historical hot
	//that havae prefix the same as the part of sentence already typed.  Here are the specific rules:
	
	//The hot degree for a sentence is defined as the number of times a user typed the exactly same sentence before
	//the returned tope 3 hot sentences should be soreted by hot degree. The first is the hottest one.
	//If several sentences have the same degree of hot, you need to use ASCII code order
	// The constructor function:
	//AutocompleSystem(String[] sentences, in[] tmes): This is the constructor.  The input is historical data.  
	//Sentences is a string array consists of previously typed sentences.  Times is the corresponding times a sentence
	//has been typed.  Your system should record these historical data.
	
	//Now the user wants to input a new sentence.  The following function will provide the next character the user types;
	//List<String>input(char c): The input c is the next character type by the user.  The character will only be lower-case letters
	//('a' to 'z'), blank space(' ') or a special character ('#') Also the previously typed sentence should be recorded in your system.
	//THe output will be the top 3 historical hot sentences that have prefix the same as the part of sentence already typed.
	//Example:  Operation: Atutocomplete(["i love you", "island", "ironman", "i love leetcode"], [5,3,2,2]) 
	//The system have tracked down the following sentences and their corresponding times: "i love you" 5 times.  "island" 3 times. 
	//"ironman": 2 times, Now The user begins another search:
	//Operation: input('i') Output["i love you", "island", "i love leetcode"] 
	//Explanation:  There are four sentences that have prefix "i".  Among them "ironman" and "i love leetcode" have same hot degree.  
	//Since ' ' has ASCII code 32 and 'r' has ASCII code 114, "i love leetcode" should be in front of "ironman".  Also we only need 
	//to output top 3 hot sentences, so "ironman" will be ignored.
	
	static class Node {
		String sentence;
		int times;
		
		//constructor for the node class
		Node(String s, int t) {
			sentence = s;
			times = t;
		}
		
	}
	
	//create a map holding the string sentence as key, and the integer times as its value
	private HashMap<String, Integer> map = new HashMap<>();
	
	//create a String for current character sent
	private String current_character_sent = "";
	
//	public AutoCompleteSystem(String[] sentences, int[] times) {
//		for(int i = 0; i < sentences.length; i++) {
//			map.put(sentences[i], times[i]);
//		}
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
