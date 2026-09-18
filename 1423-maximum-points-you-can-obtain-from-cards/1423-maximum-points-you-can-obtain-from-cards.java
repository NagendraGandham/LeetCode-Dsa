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
        int windowSum=totalSum-max;
        max=windowSum;
        for(int j=n-k;j<n;j++){
            windowSum=windowSum-cardPoints[i]+cardPoints[j];
            max=Math.min(max,windowSum);
            i++;
        }
        return totalSum-max;
}
}