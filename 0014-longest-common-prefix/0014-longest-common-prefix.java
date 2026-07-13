class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = strs[0];

        

        
        System.out.println(s);
        for (String str : strs) {
            if (s.isEmpty()) {
            return "";
        }
            char[] ch=str.toCharArray();
            for (int i = 0; s.length() > i && i < ch.length ; i++) {
                    if (s.charAt(i) == (ch[i])) {
                        continue;
                    } else {
                        s = s.substring(0, i);
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