class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int startColor = image[sr][sc];
        int [][]ans = image.clone();
        boolean [][]visited = new boolean[image.length][image[0].length];
        dfs(sr,sc,visited,image,ans,startColor,color);
        return ans;
        
    }
    
    void dfs(int i, int j, boolean[][] visited, int [][] grid, int [][]ans, int startColr, int color){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || grid[i][j]!=startColr) return;
        visited[i][j] = true;
        ans[i][j] = color;
        dfs(i-1,j,visited,grid,ans,startColr,color);
        dfs(i+1,j,visited,grid,ans,startColr,color);
        dfs(i,j-1,visited,grid,ans,startColr,color);
        dfs(i,j+1,visited,grid,ans,startColr,color);
        
    }
}