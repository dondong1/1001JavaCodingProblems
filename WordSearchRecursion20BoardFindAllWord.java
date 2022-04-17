package testing;

//Given a 2D board and a word, find if the word exists in the grid
//The word can be constructed from letters of sequentially adjacent cell
//where "adjacent" cells are those horizontally or vertically neighboring
//The same letter cell may not be used more than once.


public class WordSearchRecursion20BoardFindAllWord {
	//RUN TIME COMPLEXITY: 	WE HAVE TO GO THROUGH THE ROW THAT IS O(N) THEN WE HAVE TO 
	//GO THROUGH THE COLUMN SO MULITPLY BY ANOTHER N SO THE TOTAL RUNTIME IS O(N*N) OR O(N2)
	
	//SPACE COMPLEXITY: THE WORST CASE WE HAVE TO STORE THE ENTIRE BOARD SO SPACE COMPLEXITY IS O(N) 
	
	public static boolean exist(char[][]board, String word) {
		//we are going to iterate through the board to find the first letter 
		//the first loop we go through every row
		for(int i = 0; i < board.length; i++) {
			//this loop we go through every columns
			for(int j = 0; j < board[i].length; j++) {
				//We are checking the first letter of our word right so word.CharAt(0)
				//and we can find the remainder of the word then we can return true
				//this is where we will write our dfs function
				//If we find the first letter and the dfs return true meaning all other chars will return true
				//we need to pass our board, row, column, the count , the word that we are on into the dfs funciton
				if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
					return true;
				}
			}
		}
		//This is where we finished entire loops but found nothing the return false
		return false;
	}
	
		public static boolean dfs(char[][] board, int i, int j, int count, String word) {
			//we know if we find the word then the count has to be equal word.length
			if(count == word.length()) {
				return true;
			}
			//We also want to set the condition for the recursive to stop
			//Otherwise it will keep going outside the grid
			if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
				return false;
			}
		//we need to add them back after recursive calls 
			// So we have to store them in temp
			char temp = board[i][j];
			//now we set the board we have saved its value to an empty space
			board[i][j] = ' ';
			//now we try and do our recursion again for the next the cell next to it, before it, above it, below it.
			boolean found = dfs(board, i +1, j, count +1, word)
					|| dfs(board, i -1, j, count +1, word)
					|| dfs(board, i, j+1, count + 1, word)
					|| dfs(board, i, j-1, count +1, word);
					//After that we have to restore our board
				board[i][j] = temp;
				return found;
	}
	public static void main(String[] args) {
		char[][] board = {{'A','B','C', 'E'}, {'S','F','C','S'}, {'A','D','E','E'},};
				String word = "ABCB";
				System.out.println(exist(board, word));
				String word2 = "SEE";
				System.out.println(exist(board, word2));
	}

}
