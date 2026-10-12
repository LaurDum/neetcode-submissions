class Solution {
    public int maxProfit(int[] prices) {
        int day = 0;
        int maxProfitDay=0;
        int maxProfit=0;

      for (int i=0; i < (prices.length-1); i++){
        for (int j=i+1; j < prices.length; j++){
            if(prices[j] - prices[i] > maxProfit){
                maxProfitDay = i+1;
                maxProfit = prices[j] - prices[i];
            }
        }
      }
return maxProfit;

    }
}
