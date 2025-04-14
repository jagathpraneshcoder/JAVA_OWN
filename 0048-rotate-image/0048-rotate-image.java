class Solution {

    public static void reverse(int[] matrix){
        int i=0,j=matrix.length -1;
        while(i<=j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        //transporse
        //reverse each row
        for(int i=0;i<=matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            reverse(matrix[i]);
        }
    }
}