class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue = new ArrayDeque<>();
        int [][]visited = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                    visited[i][j] = 2;
                }else visited[i][j] = 0;
            }
        }
        
        int []delR = {-1, 0, 1, 0};
        int []delC = { 0, 1, 0, -1};
        int time = 0;
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int row = p.a;
            int col = p.b;
            int t = p.c;
            time = Math.max(time,t);
            
            for(int i=0;i<4;i++){
                    int nr = row + delR[i];
                    int nc = col + delC[i];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && visited[nr][nc]!=2 && grid[nr][nc]==1){
                        queue.add(new Pair(nr,nc,t+1));
                        visited[nr][nc] = 2;
                    } 
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]!=2 && grid[i][j]==1) return -1;
            }
        }
        return time;
    }
}

class Pair{
    int a;int b;int c;
    
    Pair(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}