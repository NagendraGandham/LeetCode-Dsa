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
    public int kthSmallest(TreeNode root, int k) {
        int[] num=new int[]{0};
        smallest(root,num,new int[]{k});
        return num[0];
    }

    void smallest(TreeNode root,int[] m,int[] n){
        if(root==null){
            return;
        }
        smallest(root.left,m,n);
        if(n[0]--==1){
             m[0]=root.val;
             return;
        }
        smallest(root.right,m,n);
    }
}