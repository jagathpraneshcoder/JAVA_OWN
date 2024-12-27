class Solution {
    public int maxSubArray(int[] nums) {
        int finalSum=nums[0],currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentSum<0) 
                currentSum=0; 
            currentSum+=nums[i];
            if(finalSum<currentSum) 
                finalSum=currentSum;
        }
        return finalSum;
    }
}