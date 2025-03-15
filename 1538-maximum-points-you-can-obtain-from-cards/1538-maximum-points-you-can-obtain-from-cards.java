class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int n = cardPoints.length;
        int maxSum = 0;
        for(int i = 0 ; i <= k-1 ; i++){
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;
        int rIndex = n-1;
        for(int i = k-1 ;i>=0;i--){
            rightSum += cardPoints[rIndex];
            leftSum -= cardPoints[i];
            rIndex--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}