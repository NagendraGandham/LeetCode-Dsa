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
            for (int i = 0; i < str.length() ; i++) {
                if (s.length() > i) {
                    if (s.charAt(i) == (str.charAt(i))) {
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