package testing;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class SumEvenGrandParentTreeNode {
	public int sumEvenGrandparent(TreeNode root) {
        int output = 0;
        
        if(root == null) {
            return 0;
        }
        
         List<TreeNode> list = new LinkedList();
         traverse(root,list);
        
         List<TreeNode> result = list.stream().filter(x-> x!=null).collect(Collectors.toList());
         
        for(int i = 0 ; i < result.size() ; i++) {
            output+= result.get(i).val;
        }
        
        return output;
    }
    
    
    private void traverse(TreeNode root, List<TreeNode> list) {
        
        if(root==null) {
            return;
        }
        
        
        if(root.val%2==0) {    
            if(root.left!=null) {
                list.add(root.left.left);    
                list.add(root.left.right);    
            }
            
            if(root.right!=null) {
                list.add(root.right.left);    
                list.add(root.right.right);    
            }
        }
        
        traverse(root.left, list);
        traverse(root.right, list);
    }
    
}
