class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = nums.length-1;
        int i = 0;
        //int mid = (i + j) / 2;
        while(i<=j){
            if(nums[i]+nums[j]==target) 
                return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]>target){
                j--;
                
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
}