class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = row * col - 1;
        while(i<=j){
            int mid = i + (j - i)/2;
            int m = mid / col;
            int n = mid % col;
            if(matrix[m][n] == target){
                return true;
            }
            else if(matrix[m][n] > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return false;
    }
}