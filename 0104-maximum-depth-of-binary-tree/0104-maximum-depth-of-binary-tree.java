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
    public int maxDepth(TreeNode root) {
        int[] d={0};
        depth(root,d,1);
        return d[0];
    }
    void depth(TreeNode root,int[] d,int level){
        if(root==null){
            return;
        }
        if(level>d[0]){
            d[0]=level;
        }
        depth(root.left,d,level+1);
        depth(root.right,d,level+1);
    }
}