class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][]vis = new boolean[m][n];
        int ans=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(m,n,i,j,vis,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    
    void dfs(int m, int n, int gi, int gj, boolean [][]visited, char [][]grid){
        if(gi<0 || gi>=m || gj<0 || gj>=n || grid[gi][gj] == '0' || visited[gi][gj]) return;
        
        if(grid[gi][gj]=='1'){
            visited[gi][gj]=true;
            dfs(m,n,gi-1,gj,visited,grid);
            dfs(m,n,gi,gj+1,visited,grid);
            dfs(m,n,gi+1,gj,visited,grid);
            dfs(m,n,gi,gj-1,visited,grid);  
        } 
        
    }
}

class Pair{
    Integer a;
    Integer b;
    
    Pair(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }
}