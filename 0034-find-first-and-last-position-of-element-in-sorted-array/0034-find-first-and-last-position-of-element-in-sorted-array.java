class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = new int[2];
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);
        return ans;
    }

    public int binarySearch(int []nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        int position = -1;
        while(start <= end) {
            int mid = start + ((end - start)/2);
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
            else{
                position = mid;
                if(isFirst) end = mid - 1;
                else start = mid + 1;
            }
        }
        return position;
    }
}

