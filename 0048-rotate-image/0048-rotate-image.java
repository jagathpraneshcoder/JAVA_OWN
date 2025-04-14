class Solution {
    public void rotate(int[][] matrix) {
        int[][] answer = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                answer[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(i+" "+j+" "+j+" "+(matrix[0].length-i-1));
                matrix[j][matrix[0].length-1-i] = answer[i][j];
            }
        }
    }
}