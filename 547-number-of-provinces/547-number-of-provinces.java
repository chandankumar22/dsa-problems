class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            List<Integer> list= list = new ArrayList<>();
            for(int j=0;j<isConnected[i].length;j++){
                if(i!=j){
                    if(isConnected[i][j]==1){
                        list.add(j+1);                        
                    }    
                }
            }
            al.add(list);
        }
        
        boolean []visited = new boolean[isConnected.length];
        int count  = 0;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                count++;
                dfs(i+1,al,visited);
            }
        }
        return count;
    }
    
    void dfs(Integer val, List<List<Integer>> graph,boolean []visited){
        visited[val-1] = true;
        List<Integer> neighbors = graph.get(val-1);
        for (Integer neighbor : neighbors) {
            if (!visited[neighbor - 1]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}