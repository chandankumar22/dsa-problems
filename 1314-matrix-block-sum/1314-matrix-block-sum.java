class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int [][]dp = new int[rowLen][colLen];
        int [][]ans = new int[rowLen][colLen];
        dp[0][0] = mat[0][0];
        
        for(int i=1;i<colLen;i++) dp[0][i]=dp[0][i-1]+mat[0][i];
        for(int i=1;i<rowLen;i++) dp[i][0]=dp[i-1][0]+mat[i][0];
        
        for(int i=1;i<rowLen;i++){
            for(int j=1;j<colLen;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+mat[i][j];
            }
        }
        for(int i=0;i<dp.length;i++) System.out.println(Arrays.toString(dp[i]));
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                int ipk = i+k;
                int imk = i-k-1;
                int jpk = j+k;
                int jmk = j-k-1;
                int top = 0;
                int left = 0;
                int topleft = 0;
                if(ipk>=rowLen) ipk=rowLen-1;
                if(jpk>=colLen) jpk=colLen-1;
                if(imk>=0) {
                    top=dp[imk][jpk];
                }
                if(jmk>=0){
                    left=dp[ipk][jmk];
                }
                if(jmk>=0 && imk>=0){
                    topleft=dp[imk][jmk];
                }
                
                ans[i][j] = dp[ipk][jpk]-
                            top-
                            left+
                            topleft;
                
//                 int lastEl;
//                 if(i+k>=rowLen)
            }
        }
        
        return ans;
    }
}