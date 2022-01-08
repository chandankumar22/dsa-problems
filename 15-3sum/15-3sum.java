class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int start=0, end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int target = 0-nums[i];
            start=i+1;
            end=nums.length-1;
            while(start<end){
                if(start!=i+1 && nums[start]==nums[start-1]) start++;
                else if(end!=nums.length-1 && nums[end]==nums[end+1]) end--;
                else if(nums[start]+nums[end]<target) start++;
                else if(nums[start]+nums[end]>target) end--;
                else {
                    ans.add(List.of(nums[i],nums[start],nums[end]));       
                    start++;
                    end--;
                }
            }
        }
        return ans;
    }
}