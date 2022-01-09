class Solution {
    public void sortColors(int[] nums) {
        int numR = 0;
        int numW = 0;
        int numB = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) numR++;
            else if(nums[i]==1) numW++;
            else if(nums[i]==2) numB++;
        }
        // System.out.println(numR);
        // System.out.println(numW);
        // System.out.println(numB);
        for(int i=0;i<nums.length;i++){
            if(i<numR) nums[i] = 0;
            else if(i<numR+numW) nums[i] = 1;
            else if(i<numR+numW+numB) nums[i] = 2;
        }
    }
}