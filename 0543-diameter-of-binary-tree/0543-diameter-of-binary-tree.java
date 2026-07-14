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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int[] a={0};
        path(root,a);
        return a[0];
    }
    int path(TreeNode root,int[] a){
        if(root==null){
            return 0;
        }
        int left=1+path(root.left,a);
        int right=1+path(root.right,a);
        int p=right+left-2;
        if(p>a[0]){
            a[0]=p;
        }
        return Math.max(left,right);
    }
}