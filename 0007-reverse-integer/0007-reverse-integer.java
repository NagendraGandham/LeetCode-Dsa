class Solution {
    public int reverse(int x) {
      
        long num=0;
        int copy=x;
        while(x!=0){
            int n=x%10;
            x=x/10;
            num=num*10+n;
        }
        if(num==(int)num)
            return (int)num;
        return 0;

    }
}