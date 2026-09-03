class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return helper(nums,goal)-helper(nums,goal-1); 
    }
    public int helper(int[] nums,int goal){
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        while(j<nums.length){
            sum+=nums[j];
            while(i<=j && sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}