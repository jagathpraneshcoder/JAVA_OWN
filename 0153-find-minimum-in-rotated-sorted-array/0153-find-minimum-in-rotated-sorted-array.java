class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid = (i+j)/2;
        while(i<=j){
            if(nums[i]>nums[j]){
                i++;
            }
            else if(nums[i]<nums[j]){
                j--;
            }
            else if(i==j){
                return nums[i];
            }
        }
        return 0;
    }
}