class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] nums1=new int[nums.length];
        int i=0;
        int j=1;
        for(int num:nums){
            if(num<0){
                nums1[j]=num;
                j+=2;
            }
            else{
                nums1[i]=num;
                i+=2;
            }
        }
        return nums1;
    }
}