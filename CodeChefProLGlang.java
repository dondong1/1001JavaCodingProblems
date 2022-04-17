package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChefProLGlang {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t -->0) {
			    int[] a = new int[6];
			    for(int i = 0; i <6; i++) {
			        a[i] = sc.nextInt();
			    }
			  ArrayList<Integer> b = new ArrayList<>(2);
			  b.add(a[0]);
			  b.add(a[1]);
			  ArrayList<Integer> c = new ArrayList<>(2);
			  c.add(a[2]);
			  c.add(a[3]);
			  ArrayList<Integer> d = new ArrayList<>(2);
			  d.add(a[4]);
			  d.add(a[5]);
			    if(b.contains(c.get(0)) && b.contains(c.get(1))) System.out.println("1");
			    else if (b.contains(d.get(0)) && b.contains(d.get(1))) System.out.println("2");
			    else System.out.println("0");
			    
			    
			    
			}
		}
	}