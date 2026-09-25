class Solution {
    class frequency{
        int num;
        int freq;
        frequency(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       PriorityQueue<frequency> queue=new PriorityQueue<>((s1,s2)-> s2.freq-s1.freq);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(new frequency(entry.getKey(),entry.getValue()));
        }
        int[] arr=new int[k];
        while(k--!=0){
            arr[arr.length-k-1]=queue.poll().num;
        }
        return arr;
    }
}