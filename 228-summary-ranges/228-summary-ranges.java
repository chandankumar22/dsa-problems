class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
       if(nums.length==0) return ans;
        if(nums.length==1) ans.add(nums[0]+"");
        int start=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]+1) continue;
              if(start==i-1) ans.add(nums[start]+"");
              else ans.add(nums[start]+"->"+nums[i-1]);
              start=i;
              if(start==nums.length-1) ans.add(nums[start]+""); 
        }
        if(start!=nums.length-1) ans.add(nums[start]+"->"+nums[nums.length-1]);
        return ans;
    }
    
    
}