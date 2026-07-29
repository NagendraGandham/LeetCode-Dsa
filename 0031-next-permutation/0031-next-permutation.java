class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        int j=nums.length-1;
        int k=0;
        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i==0){
            while(k<j){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k++;
                j--;
            }
            return;
        }
        int min=i;
        for( j=i+1;j<nums.length;j++){
            System.out.println(j);
            if(nums[j]>nums[i-1]){
                min=j;
            }
        }
       System.out.println(i-1+" "+min);
        int temp=nums[i-1];
        nums[i-1]=nums[min];       
        nums[min]=temp;

    k=nums.length-1;
    while(i<k){
        temp=nums[k];
        nums[k]=nums[i];
        nums[i]=temp;
        i++;
        k--;
    }
    
    }
}