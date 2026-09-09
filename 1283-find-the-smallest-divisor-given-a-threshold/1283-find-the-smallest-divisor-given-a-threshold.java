class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>high ){
                high=nums[i];
            }
        }
        int ans=high;
        int low =1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isEnough(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return ans;
    }

    public boolean isEnough(int[] nums,int t,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        if(sum<=t){
            return  true;
        }
        return false;
    }
}