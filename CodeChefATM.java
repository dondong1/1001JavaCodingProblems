package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeChefATM {

	public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String[] in = bf.readLine().split(" ");
        float n = Float.parseFloat(in[0]);
        float f = Float.parseFloat(in[1]);
        
        if(n%5==0 && f>=n+0.5f)
        System.out.println(f-n-0.5f);
        
        else{
            System.out.println(f);
        }
        
    }
}
