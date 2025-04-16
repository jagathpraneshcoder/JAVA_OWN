class Solution {
    public int maxSubArray(int[] nums) {
        int finalSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            if(currentSum<0){
                currentSum = 0;
            }
            currentSum+=nums[i];
            if(currentSum>finalSum){
                finalSum = currentSum;
            }
        }
        return finalSum;
    }
}