class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            if(nums[i]-1 == i || nums[nums[i]-1] == nums[i]) i++;
            else swap(i, nums[i]-1, nums);
        }

        List<Integer> ans = new ArrayList<Integer>();
        for(i = 0; i < nums.length; i++){
            if(i != nums[i]-1) ans.add(nums[i]);
        }

        return ans;
    }

    public void swap(int i , int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}