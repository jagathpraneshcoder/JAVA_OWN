class Solution {

    static void dfs(int V,int[][] isConnected,boolean[] visited){
        visited[V] = true;
        for(int i=0;i<isConnected[V].length;i++){
            if(isConnected[V][i]==1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
}