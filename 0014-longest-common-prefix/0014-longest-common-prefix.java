class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(String str:strs){
            int i=0;
            if(str.isEmpty()){
                return "";
            }
            while(i<str.length() && s.length()>i){
                if(str.charAt(i)==s.charAt(i)){
                    i++;
                    continue;
                }
                else{
                    s=s.substring(0,i);
                    break;
                }
            }
            if(s.length()>str.length()){
                s=str;
            }
        }
        return s;
    }
}