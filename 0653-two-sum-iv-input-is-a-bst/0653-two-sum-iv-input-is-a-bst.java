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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set=new HashSet<>();
        return traversal(set,root,k);
    }
    boolean traversal(HashSet<Integer> set,TreeNode root,int k){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        if(traversal(set,root.left,k)){
            return true;
        }
        if(traversal(set,root.right,k)){
            return true;
        }
        return false;
    }
}