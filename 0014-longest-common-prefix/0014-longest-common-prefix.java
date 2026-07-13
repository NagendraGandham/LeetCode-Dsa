class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        for (String str : strs) {
            if (str.length() < s.length()) {
                s = str;
            }
        }

        
        System.out.println(s);
        for (String str : strs) {
            char[] ch=str.toCharArray();
            for (int i = 0; i < ch.length ; i++) {
                if (s.length() > i) {
                    if (s.charAt(i) == (ch[i])) {
                        continue;
                    } else {
                        
                        s = s.substring(0, i);
                    }
                }
            }
        }
        return s;
    }
}