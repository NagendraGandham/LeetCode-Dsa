class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low=weights[0];
        for(int i:weights){
            high+=i;
            if(low<i){
                low=i;
            }
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(satisfy(mid,weights,days)){
           
                ans=mid;
                high=mid-1;
            }
            else{
        
                low=mid+1;
            }
        }
        return ans;
    }
        public boolean satisfy(int m,int[] weights,int days){
            int count=1;
            int sum=0;
        for(int i:weights){
            if(sum+i>m){
                count++;
                sum=0;
            }
            sum+=i;
        }
        if(count<=days){
            return true;
        }
        return false;
        
        }
    }