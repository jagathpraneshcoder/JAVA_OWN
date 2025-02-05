class Solution {

    static void dfs(int i,int j,int[][] grid,boolean[][] visited){
        visited[i][j] = true;
        int[] delRow = {-1,0,1,0};
        int[] delColumn = {0,1,0,-1};
        for(int k=0;k<4;k++){
            int nRow = i + delRow[k];
            int nColumn = j + delColumn[k];
            if(nRow>=0 && nRow<grid.length && nColumn>=0 && nColumn < grid[0].length &&
                grid[nRow][nColumn]==1 && !visited[nRow][nColumn])
                dfs(nRow,nColumn,grid,visited);
        }
    } 

    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        boolean[][] visited = new boolean[row][column];
        for(int i=0;i<column;i++){
            if(grid[0][i]==1)
                dfs(0,i,grid,visited);
            if(grid[row-1][i]==1)
                dfs(row-1,i,grid,visited);
        }
        for(int i=0;i<row;i++){
            if(grid[i][0]==1)
                dfs(i,0,grid,visited);
            if(grid[i][column-1]==1)
                dfs(i,column-1,grid,visited);
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==1 && !visited[i][j])
                    count++;
            }
        }

        return count;
    }
}