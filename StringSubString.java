package testing;

import java.util.Scanner;

public class StringSubString {

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    int n = sc.nextInt();
        String[] W=new String[n];
        for(int i=0;i<n;i++){
            W[i]=sc.next();
            int flag=0;
            for(int j=0;j<W[i].length();j++){
                char ch=W[i].charAt(j);
                if(S.indexOf(ch)==-1){
                    System.out.println("No");
                    flag=1;
                    break;
                }
            }
          if(flag!=1){
              System.out.println("Yes");
              flag=0;
          }
        }
	}
}