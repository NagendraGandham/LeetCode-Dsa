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
    public TreeNode bstFromPreorder(int[] preorder) {
        return createTree(preorder,0,preorder.length-1);
        
    }

    public TreeNode createTree(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(preorder[start]);
        int low=start+1;
        while(low<=end && preorder[low]<preorder[start]){
            low++;
        }
        root.left= createTree(preorder,start+1,low-1);
        root.right= createTree(preorder,low,end);
        return root;
    }
}