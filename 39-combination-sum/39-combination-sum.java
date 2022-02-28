class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        recurse(0,candidates,target,new ArrayList<>());
        return ans;
    }
    
    public void recurse(int index, int []arr, int target, List<Integer> seq){
        if(index==arr.length){
            if(target==0) ans.add(new ArrayList<>(seq));
            return;
        }
        if(arr[index]<=target){
            seq.add(arr[index]);
            recurse(index,arr,target-arr[index],seq);
            seq.remove(Integer.valueOf(arr[index]));
        }
        recurse(index+1,arr,target,seq);
    }
}