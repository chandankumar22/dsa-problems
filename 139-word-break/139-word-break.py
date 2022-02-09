class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        d=set(wordDict)
        n=len(s)
        dp=[[None for j in range(n)] for i in range(n)]
        for i in range(n):dp[i][i]=s[i] in d
        for gap in range(n):
            for start in range(n):
                i=start
                j=i+gap
                if(j>=n):continue
                if(s[i:j+1] in d):dp[i][j]=True
                else:
                    ans=False
                    for k in range(i+1,j+1):
                        temp=dp[i][k-1] and dp[k][j]
                        ans=ans or temp
                        if(ans):break
                    dp[i][j]=ans
        return dp[0][n-1]
                
#         def mcm(i,j):
#             if(dp[i][j] is not None):return dp[i][j]
#             if(i>j):
#                 dp[i][j]=False
#                 return False
#             if(s[i:j+1] in d):
#                 dp[i][j]=True
#                 return True
#             ans=False
#             for k in range(i+1,j+1):
#                 temp=mcm(i,k-1) and mcm(k,j)
#                 ans=ans or temp
#                 if(ans):break
#             dp[i][j]=ans
#             return ans
        
#         return mcm(0,n-1)