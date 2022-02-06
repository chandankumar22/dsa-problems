class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        n=len(nums)
        if(n==0):return 0
        m={0:1}
        count=0
        s=0
        for i in range(n):
            s+=nums[i]
            if(s-k in m):count+=m[s-k]
            if(s not in m):m[s]=1
            else:m[s]+=1
        return count
            
            