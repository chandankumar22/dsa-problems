class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        boolean [][]visited = new boolean[m][n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max = Math.max(dfs(i,j,visited,grid),max);
            }
        }
        
        return max;
        
        
    }
    
    int dfs(int i, int j, boolean[][] visited, int [][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0 || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i-1,j,visited,grid)+
        dfs(i+1,j,visited,grid)+
        dfs(i,j-1,visited,grid)+
        dfs(i,j+1,visited,grid);
        
    }
}