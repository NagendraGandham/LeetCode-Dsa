class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate(0,0,list,n,new StringBuilder());
        return list;
    }

    public void generate(int open,int close,List<String> list,int n,StringBuilder s){
        if(open>n){
            return;
        }
        if(open==n && close==n){
            list.add(s.toString());
            return;
        }
        if(open<n){
            s.append('(');
            generate(++open,close,list,n,s);
            s.deleteCharAt(s.length()-1);
            open--;
        }
        if(close<open){
            s.append(')');
            generate(open,++close,list,n,s);
            s.deleteCharAt(s.length()-1);
            close--;
        }
    }
}