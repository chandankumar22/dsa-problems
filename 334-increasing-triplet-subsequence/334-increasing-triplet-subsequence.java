class Solution {
    public boolean increasingTriplet(int[] nums) {
          int n = nums.length, i = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        while(i < n){
            if(low >= nums[i])   
                low = nums[i++]; 
            else if(high >= nums[i])    
                high = nums[i++];  
            else 
                return true; 
        }
        return false;
    }
}