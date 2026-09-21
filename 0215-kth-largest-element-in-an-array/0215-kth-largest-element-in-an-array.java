class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((s1,s2)->s2-s1);
        for(int i:nums){
            queue.offer(i);
        }
        while(k--!=1){
            queue.poll();
        }
        return queue.poll();
        
    }
}