class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(mid,piles)<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    double find(int mid,int[] piles){
        double count=0;
        for(int i:piles){
            count+=(i+mid-1)/mid;
        }
        return count;
    }
}