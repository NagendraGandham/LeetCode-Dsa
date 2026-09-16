class Solution {
    public int numberOfSubstrings(String s) {
        int[] map=new int[]{-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']=i;
            if(map[0]>=0 && map[1]>=0 && map[1]>=0){
                count+= substrings(map,s)+1;
            }
        }
        return count;
    }
    int substrings(int[] map,String s){
        int min=s.length();
        for(int i:map){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}