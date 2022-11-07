class Solution {
    public int[] findErrorNums(int[] nums) {
        
            int i = 0;
            while(i < nums.length){

                if(nums[nums[i]-1] != nums[i]){ // 
                    if(nums[i]-1 == i) i++;
                    else swap(i , nums[i]-1, nums);
                }else i++;

                
            }

            int []ans = new int[2];
            for(i = 0; i < nums.length; i++){
                if(nums[i] -1 != i){
                    ans[0] = nums[i];
                    ans[1] = i+1;
                }
            }
            return ans;

    }

    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}