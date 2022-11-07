class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i = 0;
        while (i < nums.length){

            if(nums[i] < nums.length && nums[i] > 0){
                if(nums[i] - 1 == i || nums[nums[i]-1] == nums[i]) i++;
                else swap(i, nums[i] - 1, nums);        
            } else i++;

        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] - 1 != i) return i+1;
        }
        return nums.length + 1;

    }

    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}