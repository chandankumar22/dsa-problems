class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
        List<List<Integer>> ans  = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
           //  System.out.println("i = "+i);
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<nums.length; j++){
             //    System.out.println("j = "+j);
                 if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int start = j + 1;
                int end = nums.length-1;
                int key = target - (nums[i]+nums[j]);
               // System.out.println("key is: "+key);
                //prevJ=j;
                while(start<end){
                 //    System.out.println("onto "+i+", "+j+", "+start+", "+end);
                    if(start!=j+1 && nums[start]==nums[start-1]){
                        start++;
                        continue;  
                    } 
                    if(end!=nums.length-1 && nums[end] == nums[end+1]) {
                        end--;
                        continue;
                    }
                    if(key>nums[start]+nums[end])start++;
                    else if(key<nums[start]+nums[end]) end--;
                    else{
                   //     System.out.println("adding "+i+", "+j+", "+start+", "+end);
                      ans.add(List.of(nums[i],nums[j],nums[start++],nums[end--]));    
                    } 
                }
                
            }
        }
        return ans;
    }
}