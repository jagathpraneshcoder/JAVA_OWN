class Solution {
 
    static void dfs(int i,int j,char[][] board,boolean[][] visited){
        visited[i][j] = true;
        int[] delRow = {-1,0,1,0};
        int[] delColumn = {0,1,0,-1};
        int n = board.length;
        int m = board[0].length;
        for(int k=0;k<delRow.length;k++){
            int nRow = i + delRow[k];
            int nCol = j + delColumn[k];
            if( nRow >= 0 && nRow < n && nCol >= 0 && nCol < m &&
                board[nRow][nCol] == 'O' && !visited[nRow][nCol]){
                    dfs(nRow,nCol,board,visited);
                }
        }

    }
    public void solve(char[][] board) {
        int row = board.length;
        int column = board[0].length;
        boolean[][] visited = new boolean[row][column];
        //for row
        for(int i=0;i<column;i++){
           if(board[0][i]=='O'){
                dfs(0,i,board,visited);
           }
            if(board[row-1][i]=='O'){
                dfs(row-1,i,board,visited);
            }
        }
        //for column
        for(int j=0;j<row;j++){
            if(board[j][0]=='O'){
               
                dfs(j,0,board,visited);
            }
            if(board[j][column-1]=='O'){
                dfs(j,column-1,board,visited);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]=='O' && !visited[i][j])
                    board[i][j] = 'X';
            }
        }

    }
}