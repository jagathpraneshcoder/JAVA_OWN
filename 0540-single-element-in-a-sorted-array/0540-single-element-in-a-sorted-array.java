class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0,right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(left+right)/2;
            if(mid%2!=0)
                mid=mid-1;
            if(nums[mid]!=nums[mid+1])
                right=mid-1;
            else
                left=mid+2;
        }
        return nums[mid];
    }
}