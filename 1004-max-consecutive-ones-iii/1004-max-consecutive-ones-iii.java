class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int i=0,j=0;
        int max=0;
        while(i<nums.length){
            if(nums[i]==0){
               count++;
            }
            if(count>k){
                max=Math.max(max,i-j-2);
                 if(nums[j]==0){
                    count--;
                }
                j++;
            }
               i++;
            
        }
        max=Math.max(max,i-j);

        return max;
    }
}