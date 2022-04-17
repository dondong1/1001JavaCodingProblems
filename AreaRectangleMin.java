package testing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given a set of points in the xy plane, determine the minimum area of a rectangle formed from these points
//with sides parallel to the x and y axes.  If there isn'tany rectangle return 0
/*
 * Ex: 
 */

public class AreaRectangleMin {
	public int minAreaRect(int[][] points) {
		//We are going to store key Integer as the x coordinators
		// and Set<Integer>> as y coordinators having the same key x coordinator
		Map<Integer, Set<Integer>> map = new HashMap<>();
		//We see all the x coordinators are in the index 0 of each row array
		// and so the y coordinators are in the index 1 of each row array
		//So We checking every single coordinator x in the column array of points 2D array
		//and We will add them into map if key x is not yet in the map
		for(int[] x : points) {
			if(!map.containsKey(x[0])) {
				map.put(x[0], new HashSet<>());
			}
			// we update the key x with its coordinators y
			// the result will be map: {1 = [1, 3], 3 = [1, 3], 4 = [1, 3]} 
			//meaning with key x equals 1, there are two points at y =1 and y = 3, so on 
			map.get(x[0]).add(x[1]);
		}
		//We set variable minArea and initialize it to MAX so we can use Lambda boolean return the smaller value
		int minArea = Integer.MAX_VALUE; 
		for (int[] x1:points) {
			for(int[] x2:points) {
				//if two points are the same x or y  then they can't form a diagonal so we ignore and continue looking
				if(x1[0]==x2[0] || x1[1] == x2[1]) {
					continue;
				}
				//checking the map // the result will be map: {1 = [1, 3], 3 = [1, 3], 4 = [1, 3]} 
				//when 2 points are diagonal when they have same set for  2 keys  
				if(map.get(x2[0]).contains(x1[1]) && map.get(x1[0]).contains(x2[1])) {
					// then we start calculate the area by length * width
					minArea = Math.min(minArea, Math.abs(x2[0] - x1[0]) * Math.abs(x2[1] - x1[1]));
				}
			}
		}
		return minArea == Integer.MAX_VALUE ? 0 : minArea;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
