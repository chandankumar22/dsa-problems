class Solution {
    
//     List<List<Integer>> set = new ArrayList<>();
    
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         recurse(candidates,0,target,new ArrayList<>());
//         System.out.println(set);
//         return new ArrayList<>(set);
//     }
    
//     public void recurse(int []arr, int index, int target, List<Integer> seq){
//         if(index == arr.length){
//             if(target==0) set.add(new ArrayList<>(seq));
//             return;
//         }
//         if(target<=arr[index]){
//             seq.add(arr[index]);
//             recurse(arr,index,target-arr[index],seq);
//             seq.remove(Integer.valueOf(arr[index]));
//         }
//         recurse(arr,index+1,target,seq);
//     }
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        recurse(0,candidates,target,new ArrayList<>());
        return ans;
    }
    
    public void recurse(int index, int []arr, int target, List<Integer> seq){
         if(target==0){
                List<Integer> st = new ArrayList<>(seq);
                //Collections.sort(st);
              ans.add(new ArrayList<>(seq));  
            } 
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            seq.add(arr[i]);
            //System.out.println("{ "+(i+1)+", "+(target-arr[i])+", "+seq+" }");
            recurse(i+1,arr,target-arr[i],seq);
            seq.remove(Integer.valueOf(arr[i]));
        }
    }
}