class Solution {
    public String reverseWords(String s) {
         s=s.trim();
        if(s.length()<=1){
            return s;
        }

         String[] newString=s.split("\\s+");
          StringBuilder p=new StringBuilder();
         for(int i=newString.length-1;i>=0;i--){
        
            p.append(newString[i]);
           if(i>=1){
            p.append(' ');
           }
           
         }
        return p.toString();
    }
}