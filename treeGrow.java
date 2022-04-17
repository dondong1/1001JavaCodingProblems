package testing;

import javax.print.DocFlavor.BYTE_ARRAY;

public class treeGrow {

	public static void main (String[] args ) {
	String a = new String ("a");
	String b = new String ("a");
	if (a.equals(b)) {
	System.out.println("ok");
	}
	else {
		System.out.println("not ok");
		System.out.println(a);
		System.out.println(b);
	}
}}