package testing;

import java.util.Scanner;

public class CodeChef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T -->0){
			int[] arr = new int[4];
			for(int i = 0; i<4; i++) {
				 arr[i] = sc.nextInt();}
				 // A*B <X*Y is OK
				 if(arr[0]*arr[1] <= arr[2]*arr[3]){
				 System.out.println("YES");}
				 else {
				 System.out.println("NO");}} sc.close();}}
