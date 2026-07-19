class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
        HashMap<Character,Integer> map=new HashMap<>(s.length());
        HashMap<Character,Integer> map1=new HashMap<>(t.length());
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
         }
         return map.equals(map1);
        }
       
    }
}