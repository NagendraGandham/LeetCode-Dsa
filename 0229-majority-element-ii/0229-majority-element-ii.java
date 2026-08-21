class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length<3){
            Set<Integer> set=new HashSet<>();
            for(int i:nums){
                set.add(i);
            }
            return new ArrayList<>(set);
        }
        int count1=1,count2=0;
        int ele1=nums[0];
        int ele2=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i]!=ele1){
                ele2=nums[i];
                count2++;
            }

            else if(nums[i]== ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count2=0;
        count1=0;
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i==ele1){
                count1++;
            }
            else if(i==ele2){
                count2++;
            }
        }
        if(count1 > Math.floor(nums.length/3)){
            list.add(ele1);
        }

        if(count2 > Math.floor(nums.length/3)){
            list.add(ele2);
        }

        return list;
    }
}