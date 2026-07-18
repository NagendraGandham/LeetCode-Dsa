class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        char ch = s.charAt(0);
        int index = -1;
        for (int k = 0; k < goal.length(); k++) {
            if (ch == goal.charAt(k)) {
                index = k;
                int size = s.length();
                int i = index;
                int j = 0;
                do {
                    if (s.charAt(j) == goal.charAt(i)) {
                        i = (i + 1) % size;
                        j = (j + 1) % size;
                        System.out.println(i + " " + j);

                    } 
                    else{
                       break; 
                    }
                } while (i != index);
                if (index == i) {
                    return true;
                }

            }
        }

        return false;
    }
}