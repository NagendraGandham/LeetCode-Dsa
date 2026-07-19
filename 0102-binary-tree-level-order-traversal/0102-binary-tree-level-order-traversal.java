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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode root1=queue.poll();
                list1.add(root1.val);
                if(root1.left!=null){
                    queue.add(root1.left);
                }
                if(root1.right!=null){
                    queue.add(root1.right);
                }
            }
            list.add(list1);
        }
        return list;
    }
}