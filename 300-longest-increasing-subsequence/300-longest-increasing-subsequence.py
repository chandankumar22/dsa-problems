class Solution:
    def binarySearch(self,arr,start,end,n):
        just_greater=0
        while start<=end:
            mid=(start+end)//2
            if(arr[mid]==n):return mid
            elif(arr[mid]>n):
                just_greater=mid
                end=mid-1
            elif(arr[mid]<n):
                start=mid+1
        return just_greater
                                
        
    def lengthOfLIS(self, nums: List[int]) -> int:
        n=len(nums)
        lis=[]
        m=0
        for i in range(n):
            if(m==0 or lis[m-1]<nums[i] ):
                lis.append(nums[i])
                m+=1
            else:
                index = self.binarySearch(lis,0,m-1,nums[i])
                lis[index]=nums[i]
        # print(lis)
        return m