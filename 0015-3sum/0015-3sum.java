class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            while(i>0 && i<nums.length-1 && nums[i]==nums[i-1])
            i++;
            int k=i+1;
            int j=nums.length-1;
            while(k<j){
                if(nums[i]+nums[j]+nums[k]==0){
                    list.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j--;
                    k++;
                     while(k<j && nums[j]==nums[j+1]){
                        j--;
                    }
                    while(k<j && nums[k]==nums[k-1])
                    k++;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    j--;
                    while(k<j && nums[j]==nums[j+1]){
                        j--;
                    }
                }
                else{
                    k++;
                    while(k<j && nums[k]==nums[k-1])
                    k++;
                }
            }
          
        }
          return list;
    }
}