package testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToArray {

	public static void main(String[] args) {
		// NOT OK
String s = "asdfasdlfsds";
List<String> ab = Arrays.asList(s);
System.out.println(ab);
System.out.println(ab.stream().collect(Collectors.joining(", ")));

char[] ch = s.toCharArray();
//First way to print out the String to array with separator ",": WORK OK
System.out.println(Arrays.toString(ch));



//Second way to print out the String to array with separator "," BUT ENDED WITH COMMA:
String[] t = new String[ch.length];
StringBuilder sb = new StringBuilder();
StringBuilder tb = new StringBuilder();
for(int i = 0; i < ch.length; i++) {
	sb.append(ch[i]);
	sb.append(",");
}

System.out.println(sb);

//ANOTHER WAY THIRD TIMES - WORK OK 
System.out.print("[");
for(int i = 0; i < t.length; i++)
{
	
    tb.append(ch[i]);
   if(i != t.length-1) {
    	tb.append(",");
    }
   
	}
System.out.print(tb);
System.out.println("]");
	}
	//ANOTHER WAY
	
	
	
	
}


