package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

public class BalancedBrackets {
	static String isBalanced(String s) {
		Stack<Character> stack = new Stack(); 
		char[] c = s.toCharArray();
		for (int i = 0; i <s.length(); i++) {
			if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
				stack.push(s.charAt(i));
			}
			else {
				if (stack.isEmpty()) {
					return "NO";
				}else {
					char pop_val = stack.pop();
					if (c[i] == ')' && pop_val != '(' ) {
						return "NO";
					}
					else if (c[i] == ']' && pop_val != '[') {
						return "NO";
					}
					else if (c[i] == '}' && pop_val != '{') {
						return "NO";
					}
				}
			}
		}
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter an integer:");
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
            	System.out.println("Please enter the balance brackets to check: ");
                String s = bufferedReader.readLine();

               System.out.println("Your bracket is: " + isBalanced(s));


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}



