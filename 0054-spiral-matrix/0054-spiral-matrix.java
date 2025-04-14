class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<Integer>();
       int n = matrix.length;
       int m = matrix[0].length;
       int top = 0;
       int left =0;
       int right = m-1;
       int bottom = n -1;

       while(top <= bottom && left <= right){
             //left - righy
            for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
            }
            top++;
            //top - bottom
            for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                 //right - left
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom - top
            if(left <= right){
                for(int i = bottom;i>=top;i--){
                result.add(matrix[i][left]);
                }
                left++;
            }
       }
       return result;
    }
}