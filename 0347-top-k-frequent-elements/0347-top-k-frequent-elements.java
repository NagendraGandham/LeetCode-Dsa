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
       PriorityQueue<frequency> queue=new PriorityQueue<>((s1,s2)-> s1.freq-s2.freq);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(new frequency(entry.getKey(),entry.getValue()));
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] arr=new int[k];
        int i=0;
        while(!queue.isEmpty()){
            arr[i++]=queue.poll().num;
        }
        return arr;
    }
}