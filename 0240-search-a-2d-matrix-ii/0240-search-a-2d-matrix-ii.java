class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int row = 0,col = m-1;
        while( row < n && col >=0 ){
            if(matrix[row][col]==target) {
                System.out.println(matrix[row][col]);
                return true;
            }
            else if(matrix[row][col]>target) {
                System.out.println(matrix[row][col]);
                col--;
            }
            else{ 
                System.out.println(matrix[row][col]);
                row++;
            }
        }
        return false;
    }
}