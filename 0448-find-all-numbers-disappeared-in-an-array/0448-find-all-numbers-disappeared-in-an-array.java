class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            if(i != nums[i] - 1 && nums[i] != nums[nums[i] - 1]) swap(i, nums[i]-1, nums);
            else i++;
        }
        
        List<Integer> ans =  new ArrayList<>();
        for(i = 0; i < nums.length; i++){
            if(i != nums[i] - 1) ans.add(i + 1);
        }
        
        return ans;
        
    }
    
    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}