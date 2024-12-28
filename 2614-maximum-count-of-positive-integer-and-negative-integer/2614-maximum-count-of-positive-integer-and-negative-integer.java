class Solution {
    public int maximumCount(int[] nums) {
        int countP=0,countN=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) countN++;
            else if(nums[i]>0) countP++; 
        }
        return Math.max(countN,countP);
    }
}