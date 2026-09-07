class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int low=bloomDay[0];
        int high=low;
        for(int i:bloomDay){
            if(i<low){
                low=i;
            }
            if(i>high){
                high=i;
            }
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(satisfy(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    boolean satisfy(int[] bloomDay,int day,int m,int k){
        int count=0;
        int b=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                b+=count/k;
                count=0;
                if(b>=m){
                    return true;
                }
            }
        }
        b+=count/k;
        return b>=m;
    }
}