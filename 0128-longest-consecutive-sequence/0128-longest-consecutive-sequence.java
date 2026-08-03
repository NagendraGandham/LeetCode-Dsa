class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
    }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            map.put(i,1);
        }
        int max=1;
        int count=0;
        int prev=map.firstKey()-1;
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(prev+1==m.getKey()){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=1;
            }
            prev=m.getKey();
        }
        return Math.max(max,count);
    }
}