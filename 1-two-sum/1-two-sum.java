class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int []ans = new int[2];
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int targetToSearch = target-nums[i];
            Integer index = map.get(targetToSearch);
            if(index!=null){
                ans[0]=index;
                ans[1]=i;
                return ans;
            }else map.put(nums[i],i);
        }
        return ans;
            
        
        
        //AFTER SORTING
        /*Arrays.sort(nums);
        int start=0, end=nums.length-1;
        int []ans = new int[2];
        while(start<end){
            int sum = nums[start]+nums[end];
            if(sum>target) end--;
            else if(sum<target) start++;
            else{
                ans[0] = nums[start];
                ans[1] = nums[end];
                return ans;
            }
        }
        return ans;*/
        
    }
}