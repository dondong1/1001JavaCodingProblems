package testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorAndSort {
	static class Checker implements Comparator<Player> {
		public int compare(Player a, Player b) {
			if (a.score == b.score) {
				a.name.compareTo(b.name);
			}
			
			return b.score - a.score;
		}
	}
	
	static class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       	Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
			Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();

	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }
	    }

}
