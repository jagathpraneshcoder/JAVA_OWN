class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int j=(m*n)-1;
        int mid = (i+j)/2;
        while(i<=j){
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
            else if(matrix[mid/n][mid%n]>target){
                j=mid-1;
                mid = (i+j)/2;
            }
            else{
                i=mid+1;
                mid=(i+j)/2;
            }
        }
        return false;
    }
}