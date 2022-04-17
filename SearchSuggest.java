package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchSuggest {
	public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery){
//		String [] products = repository.toArray(new String[repository.size()]);
//		String[] products = (String[]) repository.toArray();
//	public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
	
		Collections.sort(repository);
		List<List<String>> res = new ArrayList<>();
		String searchWord = customerQuery;
		int n = repository.size();
		int lo = 0, hi = n -1;
		int len = searchWord.length();
		
//		Arrays.sort(products);
		for (int i = 0; i < len; i++) {
			while ((lo <= hi) && (repository.get(lo).length() <= i ||
					repository.get(lo).charAt(i) != searchWord.charAt(i))) {
				lo++;
			}
			while ((lo <= hi) && (repository.get(hi).length() <= i ||
					repository.get(hi).charAt(i) != searchWord.charAt(i))) {
				hi--;
			}
			int min = Math.min(lo +3, hi + 1);
//				int min = Math.min(lo +3, hi +1);
				List<String> list = new ArrayList<>();
				for(int j = lo; j <min; j++) {
					list.add(repository.get(j));
				}
				res.add(list);
//				Set<List<String>> result = new HashSet<List<String>>(res);
//				res.clear();
//				res.addAll(result);
		}
		
		return res;
	}

	public static void main(String[] args) {
//		String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
//		String searchWord = "mouse";
		List<String>products = Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad");
		String searchWord = "mouse";
//		System.out.println(suggestedProducts(products, searchWord));
		System.out.println(searchSuggestions(products, searchWord));
		

	}

}
