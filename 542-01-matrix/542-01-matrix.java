class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<Pair> queue = new ArrayDeque<>();
        int m = mat.length;
        int n = mat[0].length;
        boolean [][]visited = new boolean[m][n];
        int [][]ans = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new Pair(i,j,0));
                    visited[i][j] = true;
                }
            }
        }
       // System.out.println(queue);
        
        while(!queue.isEmpty()){
            Pair poll = queue.poll();
            ans[poll.row][poll.col] = poll.dist;
            int [][]directions = {{-1,0},{1,0},{0,1},{0,-1}};
            for(int dir[]: directions){
                int row = poll.row + dir[0];
                int col = poll.col + dir[1];
                
                if(row>=0 && row<m && col>=0 && col<n){
                    if(!visited[row][col]){
                        if(mat[row][col]==1){
                            queue.add(new Pair(row,col,poll.dist+1));
                            visited[row][col] = true;
                        }
                    }
                }
            }
        }
        return ans;
        
    }
}

class Pair{
    
    int row, col, dist;
    Pair(int row, int col, int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
    
    @Override
    public String toString(){
        return ""+row+","+col+","+dist;
    }
}