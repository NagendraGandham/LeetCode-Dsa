class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if(nums.length<2){
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 1;
        int count = 1;
        for (int i:set) {
            
            if(!set.contains(i-1)){
                int key=i+1;
            while(true){
                if(set.contains(key)){
                    count++;
                    key++;
                }
                else{
                    max=Math.max(count,max);
                    count=1;
                    break;
                }
            }
            }
        }
        return max;
    }
}