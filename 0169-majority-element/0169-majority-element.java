class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int key=-1;
        int value=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>value){
                key=entry.getKey();
                value=entry.getValue();
            }
        }

        return key;
    }
}