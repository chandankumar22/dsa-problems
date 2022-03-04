class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        recurse(nums,0,new ArrayList<>());
        ans.add(new ArrayList<>());
        return ans;
    }
    
    public void recurse(int []nums, int index, List<Integer> seq){
        if(index==nums.length){
        
            return;  
        } 
        for(int i=index; i<nums.length; i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            seq.add(nums[i]);
            recurse(nums,i+1,seq);
              ans.add(new ArrayList<>(seq));
            seq.remove(seq.size()-1);
        }
    }
}