class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i==0){
            int k=0;
            System.out.println("reverse");
            int j=nums.length-1;
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
        for(int j=i+1;j<nums.length;j++){
            System.out.println(j);
            if(nums[j]>nums[i-1]){
                System.out.println("kk");
                min=j;
            }
        }
       System.out.println(i-1+" "+min);
        int temp=nums[i-1];
        nums[i-1]=nums[min];       
        nums[min]=temp;

    int k=nums.length-1;
    while(i<k){
        int tep=nums[k];
        nums[k]=nums[i];
        nums[i]=tep;
        i++;
        k--;
    }
    
    }
}