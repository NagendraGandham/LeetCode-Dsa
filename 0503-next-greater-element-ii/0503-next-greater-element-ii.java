class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> deque=new ArrayDeque<>();
        int[] arr=new int[nums.length];
        for(int j=(2*nums.length)-1;j>=0;j--){
            int i=j%nums.length;
            while(!deque.isEmpty() && deque.peekFirst()<=nums[i]){
                deque.removeFirst();
            }
            if(j<nums.length){
                arr[i]=deque.isEmpty()?-1:deque.peek();
            }
            deque.push(nums[i]);
        }
     
        return arr;
    }
}