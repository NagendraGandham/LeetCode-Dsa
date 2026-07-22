class Solution {
    public int reverse(int x) {
        long num=0;
        int copy=x;
        while(x!=0){
            num=num*10+x%10;
            x=x/10;
        }
        if(num==(int)num){
            return (int)num;
        }
        return 0;
    }
}