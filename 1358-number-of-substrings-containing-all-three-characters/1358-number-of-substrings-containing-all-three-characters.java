class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
            if(map.size()==3){
                count+= substrings(map,s)+1;
            }
        }
        return count;
    }
    int substrings(HashMap<Character,Integer> map,String s){
        int min=s.length();
        for(int i:map.values()){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}