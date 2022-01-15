class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans = new int[nums.length];
        int start=0,end=nums.length-1,i=end;
        while(start<=end){
            if(nums[start]*nums[start]>nums[end]*nums[end]){
                ans[i] = nums[start]*nums[start];
                start++;
            }
            else{
                ans[i] = nums[end]*nums[end];
                end--;
            }
            i--;
        }
        return ans;
    }
}