class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) ){
                if(t.charAt(i)==map.get(s.charAt(i)) ){
                    continue;
                }
                return false;
            }
            else if(!map.containsValue(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
}