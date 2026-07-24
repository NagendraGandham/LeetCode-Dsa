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
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int[] a={root.val};
        find(root,a);
        return a[0];
    }
    
    int find(TreeNode root,int[] a){
        if(root==null){
            return 0;
        }

        int left=root.val+find(root.left,a);
        int right=root.val+find(root.right,a);
        int path=left+right-root.val;
        if(path>a[0]){
            a[0]=path;
        }
        return Math.max(Math.max(left,right),0);

    }
}