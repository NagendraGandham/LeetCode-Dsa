class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
            x=1/x;
        }
        return Power(x,n);
    }

    public double Power(double x,int N){
        if(N==0)
            return 1;
    
            if(N%2==0){
                return Power(x*x,N/2);
            }
            else{
                return x * Power(x*x,N/2);
            }
     }
}