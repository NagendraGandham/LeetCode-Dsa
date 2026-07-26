class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=binarySearchLB(nums,target);
        if(first==nums.length || nums[first]!=target){
            return new int[]{-1,-1};
        }
        int last=binarySearch(nums,target);
        return new int[]{first,last-1};
    }

    int binarySearch(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    int binarySearchLB(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}