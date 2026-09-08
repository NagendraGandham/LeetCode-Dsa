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
     class Pair{
            TreeNode node;
            int index;
            public Pair(TreeNode node,int index){
                this.node=node;
                this.index=index;
            }
        }

    public int widthOfBinaryTree(TreeNode root) {
       if(root==null){
        return 0;
       }
       int max=0;
        Queue<Pair> queue=new ArrayDeque<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            int left=queue.peek().index;
            Pair right=null;
            for(int i=0;i<size;i++){
                right=queue.poll();
                if(right.node.left!=null)
                queue.add(new Pair(right.node.left,right.index*2));
                if(right.node.right!=null)
                queue.add(new Pair(right.node.right,(right.index*2)+1));
            }
            max=Math.max(max,right.index-left+1);
        }
        return max;
    }
}