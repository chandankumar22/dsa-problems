class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        if(nums[0] < nums[nums.length-1]) return nums[0];
        int start = 0;
        int end = nums.length-1;
        
        while (start < end){
            int mid = start + ((end - start)/2);
            
            
            if (mid == nums.length - 1 || nums[mid] > nums[mid + 1]) {
                    return nums[mid+1];
                }
                else if(end < nums.length-1 && nums[end] > nums[end+1]){
                    return nums[end+1];
                }
                else if(Objects.equals(nums[start], nums[mid]) && Objects.equals(nums[mid], nums[end])) end-=1;
                else if (nums[start] > nums[mid]) end = mid;
                else start = mid;
        }
        
        return nums[start];
        
    }
}