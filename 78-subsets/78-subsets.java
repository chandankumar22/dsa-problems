class Solution {
  
      List<List<Integer>> output = new ArrayList();
  public List<List<Integer>> subsets(int[] nums) {
    

      findAllSubsets(nums,nums.length,0,new ArrayList<>());
      return output;
      }
    
    public void findAllSubsets(int []nums, int len, int index, List<Integer> ans){
        if(index>=len){
            output.add(new ArrayList<>(ans));
            return;
        }
        //take it
        ans.add(nums[index]);
        findAllSubsets(nums,len,index+1,ans);
        
        //not take it
        ans.remove(ans.get(ans.size()-1));
        findAllSubsets(nums,len,index+1,ans);
    }
    
}