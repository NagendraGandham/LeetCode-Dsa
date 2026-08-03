class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(mid<=j){
            if(nums[mid]==0){
                nums[i++]=0;
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[j];
                nums[j]=temp;
                j--;
            }
            else{
                mid++;
            }
        }
        while(i<mid){
            nums[i]=1;
            i++;
        }
    }
}