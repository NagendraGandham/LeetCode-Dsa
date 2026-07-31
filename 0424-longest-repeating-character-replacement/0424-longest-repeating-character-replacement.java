class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        int maxf=0;
        int[] arr=new int[26];
        int left=0;
       
        for( int right=0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(right)-'A']);
            while((right-left+1)-maxf > k){
                    arr[s.charAt(left)-'A']--;
                    left++;
                }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}