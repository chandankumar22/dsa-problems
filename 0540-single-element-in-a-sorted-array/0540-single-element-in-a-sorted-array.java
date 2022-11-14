class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + ((end-start)/2);

            //Since every element occurs twice, then they follow pattern first number at odd even, second at odd (index from 0)
            //In ideal case, if length is even, then mid should be equal to its previous, and if length is odd, mid should be equal to its next. Check these only

            if(mid == 0 || mid == nums.length-1) return nums[mid]; //edge case

            if(mid % 2 != 0){
                if(nums[mid] == nums[mid - 1]) start = mid + 1;
                else if(nums[mid] == nums[mid + 1]) end = mid - 1;
                else return nums[mid];
                
            }else{
                if(nums[mid] == nums[mid - 1]) end = mid - 1;
                else if(nums[mid] == nums[mid + 1]) start = mid + 1;
                else return nums[mid];
            }            
       }
        return -1;

    }
}