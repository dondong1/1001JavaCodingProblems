package testing;




import java.util.Stack;




public class RangeSumBinarySearchTreeLeetCodeGoogle {
	//Given the root node of a binary search tree
	//Return the sum of values of all nodes 
	//with values between L and R (inclusive).
	
	/**
	 * Definition for a binary tree node:
	 * public class TreeNode{
	 * int val;
	 * TreeNode left;
	 * TreeNode right;
	 * TreeNode(int x) { val = x;}
	 * }
	 */
//	public class TreeNode{
//		int key; // use for the last method dfs with clear explanation
//		int val; // use for the first two method iterate and recursive dfs
//		TreeNode left;
//		TreeNode right;
//		TreeNode(int x) {
//			val = x;
//			key = x;
//		}
//	}
	static class TreeNode
	{
	    int val; 
	    int key;
	    TreeNode left, right;
	};
	static TreeNode newTreeNode(int item)
	{
	    TreeNode temp = new TreeNode();
	    temp.val = item;
	    temp.key = item;
	    temp.left = temp.right = null;
	 
	    // Return the newly created node
	    return temp;
	}

	static TreeNode insert(TreeNode node, int data)
	{
	     
	    // Base Case
	    if (node == null)
	        return newTreeNode(data);
	 
	    // If the data is less than the
	    // value of the current node
	    if (data <= node.val)
	 
	        // Recur for left subtree
	        node.left = insert(node.left,
	                           data);
	 
	    // Otherwise
	    else
	 
	        // Recur for the right subtree
	        node.right = insert(node.right,
	                            data);
	 
	    // Return the node
	    return node;
	}
	
	
	
	//This method interative 
	//Time complexity is O(n) potentially running through all the n is for all the nodes
	//Space complexity is O(n) n is potentially we have to store all the nodes.

	public static int rangeSumBST(TreeNode root, int L, int R) {
		//The nodes value are all integers (as the definition above up in the comments
		//If the value in the range, we add it to our range sum variable 
			int range_sum = 0;
		//We traverse the whole tree
		//for the value of the current node we traverse lies between our range 
		//so if the value is greater or equal to the left boundary and less or equal the right boundary
		//we add to the range and then just return the range up
			
			//We can do two methods: iterative solution or recursive solution:
			//First: iterative solution:
			Stack<TreeNode> stack = new Stack();
			stack.push(root);
			while(!stack.isEmpty()) {
				TreeNode node = stack.pop();
				if(node != null) {
					if(node.val >= L && node.val <= R) {
						range_sum += node.val;
					}
					//Binary Search Treee: the left value node is smaller than the right value node.
					//so if value of our current node that we are traversing is greater than the left boundary 
					//So we still have to check left child node
					if(node.val > L && node.left != null) {
						stack.push(node.left);
					}
					//else if it less than the Right boundary then we add to the right child
					if(node.val < R && node.right != null) {
						stack.push(node.right);
					}
				}
			}
			
			return range_sum;
	}
	// For the Recursive DepthFirstSolution DFS we have to declare the int range_sum 
	//So we can access it from our recursive call or methods
	//Time Complexity is Big O of N O(n) n is for total number of nodes.
	//Space O(d) d is depth of the treeNode
	static int range_sum;
	
	public static int rangeSumBSTusingDepthFirstSolution(TreeNode root, int L, int R) {
		//This is the same solution as above but instead iterate we use recursive solution
		// We have to create a recursive method public void get_range_sum (see below)
		
		//we initialize the int range_sum that we declared outside above to zero
		range_sum = 0;
		//basically we just call the recursive method that we created outside of this method 
		//and it will handle doing everything and update the variable range_sum at the top
		//return range_sum
		get_range_sum(root, L, R);
		return range_sum;
	}
	public static void get_range_sum(TreeNode root, int L, int R) {
		if(root != null) {
			if (root.val >= L && root.val <= R) {
				range_sum += root.val;
			}
			if(root.val > L) {
				get_range_sum(root.left, L, R);
			}
			if(root.val < R) {
				get_range_sum(root.right, L, R);
			}
		}
		
	}
	
	/*
	 * Another EXAMPLE RECURSIVE THAT IS MORE SIMPLE
	Using recursion:
	Time: O(n),    : n is number of nodes
	Space: O(d)   : d is depth     
*/

	public static int rangeSumBST5(TreeNode root, int low, int high) {
		return rangeSumBST5(root, low, high, 0);        
	}

	public static int rangeSumBST5(TreeNode root, int low, int high, int sum) {
		if(root == null){ return sum; }        
		if(root.val >= low && root.val <= high){
			sum += root.val;
		}
		if(low < root.val){                                                     
			// call recursion to left sub-tree only if low < root.val. Else, no need to. 
			sum = rangeSumBST5(root.left, low, high, sum);                        
			// update sum value after returning from the recursion.        
		}
		if(high >= root.val){                                                   
			// call recursion to right sub-tree only if high >= root.val. Else, no need to.       
			sum = rangeSumBST5(root.right, low, high, sum);                      
		}            
		return sum;
	}

	
	
	
	
//THis is another simple way with explanation for DFS method:
	static int ans;
    public static int rangeSumBST2(TreeNode root, int low, int high) {
        // corner case
        if (root == null) return 0;
        ans = 0;
        dfs(root, low, high);
        return ans;
    }

    private static void dfs(TreeNode root, int low, int high) {
        // base case
        if (root == null) return;
        // normal case
        // if the current node value falls into the range between 'low' and 'high' (inclusive), we add the current value to 'ans'
        if (root.key >= low && root.key <= high) {
            ans += root.key;
        }
        // Normally, the dfs would be like:
        //      dfs(root.left, low, high);
        //      dfs(root.right, low, high);
        // However, the dfs won't make sense if we keep diving into the left node when root.key < low since the current
        // node is smaller than 'low' already. Going deeper will never encounter any node that falls into the range.
        // Same thing happens when we have root.key > high when we want to dive into dfs(root.right, low, high), as this
        // will not give us any node that falls into the range as well

        // The way how we prune the dfs is as below:
        //      We only dive into root.left of the dfs when     root.key > low
        //      We only dive into root.right of the dfs when    root.key < high
        // This will keep pushing us to the limit of each node of the BST until the current node reaches the boundary
        if (root.key > low) {
            dfs(root.left, low, high);
        }
        if (root.key < high) {
            dfs(root.right, low, high);
        }
    }
    
    //This is another way more simple without explaination
    //Time Complexity : O(n) n is for number of nodes (for unbalanced binary tree)
    //Time complexity for balanced BST is O(log(n))
    //Space complexity 0(1)
    
    public static int rangeSumBST3(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        sum += root.val >= low && root.val <= high ? root.val : 0;
        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);
        
        return sum;
    }
//    public static int rangeSumBST4QueueStyle(TreeNode root, int L, int R) {
//    	int sum = 0;
//    	if(root == null) {
//    		return sum;
//    	}
//    	Queue<TreeNode> queue = new LinkedList<>();
//    	queue.add(root);
//    	while(!queue.isEmpty()) {
//    		TreeNode current = queue.remove();
//    		if(current.val >= L && current.val <= R) {
//    			sum += current.val;
//    		}
//    		if(current.left != null && current.val > L) {
//    			queue.add(current.left);
//    		}
//    		if(current.right != null && current.val < R) {
//    			queue.add(current.right);
//    		}
//    	}
//    	return sum;
//    }
    
    //Given a binary treee, find its maximum depth
    //The maximum depth is the numer of nodes along the longest path from the root node down to the farthest
    //leaf node
    //Note: A leaf is a node with no children
    //EX: Given binary tree {3, 9, 20, null, null, 15, 17}
    
    public static int maxDepth(TreeNode root) {
    	//runtime is O(n) because we have to run all the way down to the leaf
    	if(root == null) {
    		return 0;
    	}
    	int left = maxDepth(root.left);
    	int right = maxDepth(root.right);
    	return Math.max(left, right) +1;
    }

	public static void main(String[] args) {
		TreeNode root = null;
		root = insert(root, 10);
		insert(root, 5);
		insert(root, 15);
		insert(root, 3);
		insert(root, 7);
		insert(root, 18);
		int L = 7, R = 15;
		
		System.out.println(rangeSumBST(root, 7, 15));
		System.out.println(rangeSumBST3(root, 7, 15));
		System.out.println(rangeSumBSTusingDepthFirstSolution(root, 7, 15));
		System.out.println(rangeSumBST2(root, 7, 15));
		System.out.println(maxDepth(root));
	}

}
