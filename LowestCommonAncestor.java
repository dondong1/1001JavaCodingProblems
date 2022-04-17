package testing;

import java.util.Scanner;

public class LowestCommonAncestor {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	static Node lca(Node root, int v1, int v2) {
		if(v1 > root.data && v2 > root.data) {
			return lca(root.right, v1, v2);
		}
		if (v1 < root.data && v2 < root.data) {
			return lca(root.left, v1, v2);
		}
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        Node root = null;
	        while(t-- > 0) {
	            int data = scan.nextInt();
	            root = insert(root, data);
	        }
	      	int v1 = scan.nextInt();
	      	int v2 = scan.nextInt();
	        scan.close();
	        Node ans = lca(root,v1,v2);
	        System.out.println(ans.data);
	}

}
