class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) max = Math.max(max,nums[i]);
        int []vals = new int[max+1];
        int []dp = new int[vals.length];
        for(int i=0;i<nums.length;i++) vals[nums[i]]+=nums[i];
        //System.out.println(Arrays.toString(vals));
        dp[0] = vals[0];
        dp[1] = Math.max(vals[0],vals[1]);
        for(int i=2;i<vals.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+vals[i]);
        }
        return dp[vals.length-1];
    }
}