class Solution {
    public int findMin(int[] nums) {
        if (nums[0] <= nums[nums.length-1]) return nums[0];
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + ((end - start)/2);
            if(mid == nums.length-1) return nums[mid];
            if(nums[mid] > nums[mid+1]) return nums[mid+1];
            else if (nums[mid] < nums[start]) end = mid;
            else start = mid;
        }
        return -1;
    }
}