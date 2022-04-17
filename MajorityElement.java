package testing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	//This approached was wrong for most of test cases
	public static int majorityElement(int a[], int size) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	       int size2 = a.length;
	       for(int i=0; i<size; i++) {
	           int times = 0;
//	   		System.out.println(majorityElement(new int[] {3,1,3,3,2}, 5));    
//	   		System.out.println(majorityElement2(new int[] {2, 2, 1, 1, 1, 2, 2}, 7));
//			System.out.println(majorityElement2(new int[] {1, 13}, 2));
//			System.out.println(majorityElement2(new int[] {13}, 1));
//			System.out.println(majorityElement2(new int[] {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9}, 13));
	           if(map.get(a[i]) != null) {
	               times = map.get(a[i]);
//	               System.out.println(times);
	               
	               map.put(a[i], times+1);
//	               System.out.println(map);
	               
	               if(times+1 > size/2) {
	                   return a[i];
	               }
	               
	           } else {
	               map.put(a[i], 1);
	               if(1 > size/2) {
	                   return a[i];
	               }
	           }
	       }
	       return -1;
	   }
	
	public static int majorityElement2(int arr[], int size)
	   {
	      //moore voting algorithm
	      int vote =1;int ele=arr[0];
	      for(int i=1;i<size;i++){
	          if(arr[i]==ele) vote++;
	          else vote--;
	          if(vote==0){
	              vote=1;
	              ele=arr[i];
	          }
	      }
	   //   System.out.print(ele);
	      //now if ele is majority or not
	     float count=0;
	      for(int i=0;i<size;i++){
	          if(arr[i]==ele)
	            count++;
	      }
	      if(count>(size/2)) return ele;
	      else return -1;
	      
	   }
	public static int majorityElement5(int a[]) {
 		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	       int size = a.length;
	       for(int i=0; i<size; i++) {
	           int times = 0;

	           if(map.get(a[i]) != null) {
	               times = map.get(a[i]);
	               
	               map.put(a[i], times+1);
//	               System.out.println(map);
	               
	               if(times+1 > size/2) {
	                   return a[i];
	               }
	               
	           } else {
	               map.put(a[i], 1);
	               if(1 > size/2) {
	                   return a[i];
	               }
	           }
	       }
	       return -1;
	   }
    static int majorityElement3(int a[], int size){
    	
    	//STILL WORKING ON IT - NOT ALL CASES ARE WORKING
		int count = 0;
		int max = 0;
		int result = -1;
		if(size == 1) {return a[0];}
		for (int i = 0; i < size -1; i++) 
			for (int j = i +1; j < size; j ++) {
				if (a[i] == a[j]) { 
					count++; 
					if(count > max) {
				 max = count;
				 if (max > size/2) {
				 result = a[i];
				}
				 else result = -1;
				 }
			}} return result;
		}
	public static void main(String[] args) {
		System.out.println(majorityElement2(new int[] {3,1,3,3,2}, 5));
		System.out.println(majorityElement2(new int[] {2, 2, 1, 1, 1, 2, 2}, 7));
		System.out.println(majorityElement2(new int[] {1, 13}, 2));
		System.out.println(majorityElement2(new int[] {13}, 1));
		System.out.println(majorityElement2(new int[] {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9}, 13));
	
		
		System.out.println(majorityElement(new int[] {3,1,3,3,2}, 5));
		System.out.println(majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}, 7));
		System.out.println(majorityElement(new int[] {1, 13}, 2));
		System.out.println(majorityElement(new int[] {13}, 1));
		System.out.println(majorityElement(new int[] {9, 14, 10, 10, 1, 2, 1, 7, 10, 10, 14, 19, 9}, 13));
		
		   Scanner sc = new Scanner(System.in);
		    String line = sc.nextLine();
		    String[] numbers = line.split(" ");
		    ArrayList<Integer> inumbers = new ArrayList<Integer>();
		        for (String s : numbers)
		        inumbers.add(Integer.parseInt(s));
		        int[] a = new int[inumbers.size()];
		        
		        System.out.println(majorityElement5(a));
		}

	}


