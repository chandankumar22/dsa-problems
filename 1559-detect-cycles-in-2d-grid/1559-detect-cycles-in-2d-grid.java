class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean [][]visited = new boolean[m][n];
        Queue<Pair> queue = new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    visited[i][j] = true;
                    queue.add(new Pair(i,j,new Pair(-1,-1)));
                    
                    
                    while(!queue.isEmpty()){
                        Pair curr = queue.poll();
                        
                        int [][]directions = {{0,-1},{0,1},{-1,0},{1,0}};
                        
                        Integer tempI,tempJ;
                        if(curr.first == -1 && curr.second == -1){
                            tempI=new Integer(i);
                            tempJ=new Integer(j);
                        }else{
                            tempI = new Integer(curr.first);
                            tempJ = new Integer(curr.second);
                        }
                        
                        for(int []dir:directions){
                            int row = tempI+dir[0];
                            int col = tempJ+dir[1];

                            if(row>=0 && row<m && col>=0 && col<n){
                                if(visited[row][col]){
                                    if(curr.parent.first!=-1 && curr.parent.second!=-1 && 
                                       row != curr.parent.first && col != curr.parent.second){
                                        if(grid[tempI][tempJ] == grid[row][col]) return true;
                                    }
                                } else if(grid[tempI][tempJ] == grid[row][col]){
                                    queue.add(new Pair(row,col,new Pair(tempI,tempJ)));
                                    visited[row][col] = true;
                                } 
                            }
                        }                          
                    }
                }
            }
        }
        return false;
    }
}

class Pair{
    int first,second;
    Pair parent;
      Pair(int first, int second){
        this.first = first;
        this.second = second;  
      }
    Pair(int first, int second, Pair parent){
        this.first = first;
        this.second = second;
        this.parent = parent;
    }
}