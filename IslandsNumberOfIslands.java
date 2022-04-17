package testing;

/*
 * Objective: Given a 2d grid map of ‘1’s (land) and ‘0’s (water), 
 * count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 *  Assume all four edges of the grid are all surrounded by water. Given such a grid, 
 * write an algorithm to find the number of islands in it.
 */
public class IslandsNumberOfIslands {
	public int numIslands(char[][] grid) {
		if(grid == null || grid.length == 0) {
			return 0;
		}
		int numIslands = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j ++) {
				if(grid[i][j] == 1) {
					numIslands += dfs(grid, i, j);
					// once we got here we need to flipped the counted one to zero so we don't double count them
					
				}
			}
		}
		return numIslands;
		
	}
	public int dfs(char[][] grid, int i, int j) {
		if(i <0 || i >= grid.length || j<0 || j>= grid[i].length || grid[i][j] == '0') {
			return 0;
		}
		grid[i][j] = '0';
		dfs(grid, i+1, j);
		dfs(grid, i -1, j);
		dfs(grid, i, j +1);
		dfs(grid, i, j-1);
		return 1;
	}

}
