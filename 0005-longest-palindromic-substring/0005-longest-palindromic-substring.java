class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
       String max=String.valueOf(s.charAt(0));
       String count="";
       for(int i=0;i<s.length();i++){
            int j=i;
            int k=i-1;
            count="";
            while(j<s.length() && k>=0 && s.charAt(j)==s.charAt(k)){
                count=s.substring(k,j+1);
                j++;
                k--;
            }
            if(max.length()<count.length()){
                max=count;
            }
       }
        for(int i=0;i<s.length();i++){
            int j=i+1;
            int k=i-1;
            count="";
            while(j<s.length() && k>=0 && s.charAt(j)==s.charAt(k)){
                count=s.substring(k,j+1);
                j++;
                k--;
            }
            if(max.length()<count.length()){
                max=count;
            }
       }
       return max;
         
    }
}