class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum=0;
        for(int i:cardPoints){
            totalSum+=i;
        }
        if(k==cardPoints.length){
            return totalSum;
        }
        int n=cardPoints.length;
        int max=0;
        for(int i=n-k;i<n;i++){
            max+=cardPoints[i];
        }

        int i=0;
        int j=n-k;
        int windowSum=totalSum-max;
        while(j<n-1){
            windowSum=windowSum-cardPoints[i];
            i++;
            j++;
            windowSum=windowSum+cardPoints[j];
            max=Math.max(max,totalSum-windowSum);
            
        }
        return max;
}
}