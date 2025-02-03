class Solution {

    static void bfs(int V,int[][] isConnected,boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;
        while(!queue.isEmpty()){
            int vertex = queue.remove();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[vertex][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if (!visited[i]) {
                count++;
                bfs(i, isConnected, visited);
            }
        }

        return count;
    }
}