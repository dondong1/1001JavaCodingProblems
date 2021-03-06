package testing;

import java.util.Arrays;

public class wiggleSort {
	public int[] wiggle(int[] items) {
		boolean up = true;
		int len = items.length;
		for(int i = 0; i < len -1 ; i++) {
			if((up && items[i] > items[i+1]) || (!up && items[i] < items[i+1])) {
				int temp = items[i];
				items[i] = items[i+1];
				items[i +1] = temp;
			}
			up = !up;
		}
		return items;
	}
	
	public String wiggleResult(int[] result) {
		return Arrays.toString(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wiggleSort ws = new wiggleSort();
		
		int[] items = {5, 2, 3, 1, 4, 8};
		int[] wiggled = ws.wiggle(items);
		
		System.out.println(ws.wiggleResult(wiggled));
	}

}
