/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        Deque<TreeNode> stack=new ArrayDeque<>();
        Deque<TreeNode> stack1=new ArrayDeque<>();
        
        stack.addFirst(root);
        TreeNode temp=root;
        while( !stack.isEmpty()){
           TreeNode node=stack.pop();
           stack1.push(node);
           if(node.right!=null){
            stack.push(node.right);
           }
           if(node.left!=null){
            stack.push(node.left);
           }
        }
        TreeNode last=stack1.pop();
        last.right=null;
        last.left=null;
        while(!stack1.isEmpty()){
            TreeNode t=stack1.pop();
            t.left=null;
            t.right=last;
            last=t;
        }
    }
}