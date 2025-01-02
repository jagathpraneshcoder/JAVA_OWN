class Solution {
    
    public boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int i=0,j= m*n -1;
        int mid=(i+j)/2;  
        while(i<=j){
            mid=(i+j)/2;
            int row = mid / n;
            int col = mid % n;
            if(nums[row][col]==target)
                return true;
            else if(nums[row][col]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
}