package testing;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		ArrayList<Integer> reverseList = new ArrayList<Integer>();
		for (int i = list.size()-1; i>= 0; i--) {
			reverseList.add(list.get(i));
		}
		System.out.println(reverseList);

	}

}
