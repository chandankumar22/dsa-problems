class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = nums.length - 1;
        int start = 0;
        int end = nums.length - 1;
        if (nums[0] < nums[nums.length - 1]) {
            pivot = 0;
        } else {
            while(start < end){
                int mid = start + ((end - start)/2);
                
                if(mid == nums.length - 1 || nums[mid] > nums[mid+1]){
                    pivot = mid; 
                    break;
                } 
                else if(nums[start] > nums[mid]) end = mid;
                else start = mid;
                
            }
        }
        
        // System.out.println("Pivot : "+pivot);
        
        int index = bsearch(nums, target, 0, pivot);
        if(index == -1) index = bsearch(nums, target, pivot + 1, nums.length-1);
        return index;
        
    }
    
    int bsearch(int []nums, int target, int start, int end){
        
        while(start <= end){
            int mid = start + ((end-start)/2);
            
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}