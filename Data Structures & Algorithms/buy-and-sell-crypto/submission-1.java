class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        if(prices.length==1){
            return 0;
        }
        int max = 0;
        int prev;
        while(right <prices.length){
            max = Math.max(max,prices[right]-prices[left]);
            if(prices[right]<prices[left]){
                left = right;
            }
            right++;
        }
        return max;
    }
}
