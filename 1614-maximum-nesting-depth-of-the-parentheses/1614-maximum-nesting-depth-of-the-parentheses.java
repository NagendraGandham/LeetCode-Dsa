class Solution {
    public int maxDepth(String s) {
        int max=0;
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.addFirst('(');
                max=Math.max(stack.size(),max);
            }
            else if(s.charAt(i)==')'){
                stack.removeFirst();
            }
            else{
                continue;
            }
        }
        return max;
    }
}