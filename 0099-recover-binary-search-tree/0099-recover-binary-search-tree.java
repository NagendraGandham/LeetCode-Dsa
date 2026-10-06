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
    public void recoverTree(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode start=null;
        TreeNode middle=null;
        TreeNode last=null;
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).val>list.get(i+1).val){
                if(start==null){
                    start=list.get(i);
                    middle=list.get(i+1);
                }
                else{
                    last=list.get(i+1);
                    break;
                }
            }
        }
            if(last==null){
                int temp=start.val;
                start.val=middle.val;
                middle.val=temp;
            }
            else{
                int temp=start.val;
                start.val=last.val;
                last.val=temp;
            }
    }

    public void inorder(TreeNode root,List<TreeNode> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}