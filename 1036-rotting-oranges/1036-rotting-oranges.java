class Pair{
    int x;
    int y;
    int time;

    Pair(int x,int y,int time){
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int[][] visited = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,time));
                    visited[i][j] = 2;
                }
            }
        }

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};

        while(!queue.isEmpty()){
            int x = queue.peek().x;
            int y = queue.peek().y;
            int newTime = queue.peek().time;
            queue.remove();
            time = Math.max(time,newTime);
            for(int k=0;k<4;k++){
                int newRow = x + delRow[k];
                int newCol = y + delCol[k];
                if( newRow>=0 && newRow < row &&
                    newCol>= 0 && newCol < col &&
                    grid[newRow][newCol] == 1 && visited[newRow][newCol]!=2 ){
                        visited[newRow][newCol] = 2;
                        queue.offer(new Pair(newRow,newCol,newTime+1));
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && visited[i][j]!=2){
                    return -1;
                }
            }
        }

        return time;
    }
}