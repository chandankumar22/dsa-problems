class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<prices.length;i++){
            if(low>=prices[i]) low = prices[i];
            else if(prices[i]-low>ans)ans = prices[i]-low;
        }
        return ans;
    }
}