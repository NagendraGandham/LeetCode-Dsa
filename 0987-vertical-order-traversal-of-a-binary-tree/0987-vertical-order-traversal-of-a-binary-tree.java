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
class Node{
    int vlevel;
    int hlevel;
    int val;
    public Node(int hlevel,int vlevel,int val){
        this.hlevel=hlevel;
        this.vlevel=vlevel;
        this.val=val;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        TreeMap<Integer,PriorityQueue<Node>> map=new TreeMap<>((s1,s2)->s1-s2);
        mapping(map,root,0,0);
       for(Map.Entry<Integer,PriorityQueue<Node>> m:map.entrySet()){
        List<Integer> l=new ArrayList<>();
            while(!m.getValue().isEmpty()){
            l.add(m.getValue().poll().val);
       }
       list.add(l);
       }

        return list;
    }

    public void mapping(TreeMap<Integer,PriorityQueue<Node>> map,TreeNode root,int vlevel,int hlevel){
        if(root==null){
            return;
        }
        Node node=new Node(hlevel,vlevel,root.val);
        map.putIfAbsent(vlevel,new PriorityQueue<>((a,b)->{
            if(a.hlevel!=b.hlevel){
                return a.hlevel-b.hlevel;
            }
            return a.val-b.val;
        }));
        map.get(vlevel).add(node);
        mapping(map,root.left,vlevel-1,hlevel+1);
        mapping(map,root.right,vlevel+1,hlevel+1);
    }
}