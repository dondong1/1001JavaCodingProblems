package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	public class Encrypt{
	static	Map<String, String> cache = new HashMap<>();
	public static String encrypt(String name) throws Exception {
		String encryptedName;
		if(cache.containsKey(name)) {
			System.out.println(name +" found in cache");
			return cache.get(name);}
		else {
			int len = name.length();
			if (len%2==0) { 
				encryptedName = 	name.substring(len/2, len) + name.substring(0, len/2);	
			}
			else {
				encryptedName = name.substring((len/2)+1, len)+"#"+name.substring(0, (len/2)+1);
			}
			System.out.println("adding to cache");
			cache.put(name, encryptedName);	
			return encryptedName;
		}}
	public static String decrypt(String name) {
		if (cache.containsValue(name)) {
			String key = "";
//			for (String key : cache.keySet()) {
			for (Map.Entry<String, String> map : cache.entrySet()){
			if(map.getValue().equals(name)) {
			key= map.getKey();
			}}
			System.out.println(name +" found in cache");
			return key;}
			else	
		 {
		int len = name.length();	
		String decryptedName = name.substring((len/2), len)+name.substring(0, (len/2));	
		if (decryptedName.endsWith("#")) {decryptedName = decryptedName.substring(0, (len-1));
		}
		System.out.println("adding to cache");
		cache.put(decryptedName, name);
		return decryptedName;
		 }}
	public static  void main(String[] args) throws Exception{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name to encrypt or decrypt:");
		while(sc.hasNext()) {
			String name = sc.next();
			System.out.println ( "1) Encrypt \n2) Decrypt 2" );
			int option = sc.nextInt();
			if (option == 1) {
			System.out.println("The encrypted name is: " + encrypt(name));}
			if (option == 2){
			System.out.println("The decrypted name is: " + decrypt(name));}
			System.out.println("Here is the list in cache: " +cache);	
		}
		sc.close();
		}catch ( Exception ex) { ex.printStackTrace();
		}}}


