class Solution {
    public int maxProfit(int[] prices) {
        
        int length = prices.length;
        if (length < 2) {
            return 0;
        }

        int res = 0;
        for (int i=1;i<length;i++) {

            int diff = prices[i] - prices[i-1];
            if (diff > 0) {
                res += diff;
            }

        }
        return res;

    }
}