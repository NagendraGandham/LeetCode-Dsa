class Solution {
    public int findMin(int[] nums) {
        if(nums.length==2){
            return nums[0]<nums[1]?nums[0]:nums[1];
        }
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[high]<nums[mid] ){
                low=mid+1;
               
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}