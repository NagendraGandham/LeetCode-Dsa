class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            nums[i]+=sum;
            sum=nums[i];
        }
        int i=0;
        int j=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        while(i<nums.length){
            if(map.containsKey(nums[i]-goal)){
                count+=map.get(nums[i]-goal);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            i++;
        }
        return count;
    }
}