class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((s1,s2)-> s2.getValue()-s1.getValue());
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        pq.addAll(map.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> m=pq.poll();
            for(int i=0;i<m.getValue();i++){
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}