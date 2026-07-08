class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copy=x;
        int n=0;
        while(x>0){
            int num=x%10;
            x=x/10;
            n=n*10+num;
        }
        if(copy==n){
            return true;
        }
        return false;
    }
}