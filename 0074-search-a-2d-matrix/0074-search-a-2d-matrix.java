class Solution {
    
    public boolean valueFind(int[] nums,int target){
        int i=0,j=nums.length-1;
        int mid=0;
        int ub=Integer.MIN_VALUE;   
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if((matrix[i][0]<=target) && (matrix[i][matrix[i].length-1]>=target)){
                if(valueFind(matrix[i],target))
                    return true;
            }
        }
        return false;
    }
}