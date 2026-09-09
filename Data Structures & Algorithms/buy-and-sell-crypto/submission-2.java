class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int max =prices[0];
        int maxprofit =0;
        for(int i=1;i<n;i++){
            max =Math.min(max,prices[i]);

            maxprofit =Math.max(maxprofit,prices[i]-max);

        }
        return maxprofit;
        
    }
}
