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
        boolean[] a=new boolean[1];
         traversal(set,root,k,a);
        return a[0];
    }
    void traversal(HashSet<Integer> set,TreeNode root,int k,boolean[] a){
        if(root==null){
            return;
        }
        if(set.contains(k-root.val)){
            a[0]=true;
            return ;
        }
        set.add(root.val);
        traversal(set,root.left,k,a);
        traversal(set,root.right,k,a);
    }
}