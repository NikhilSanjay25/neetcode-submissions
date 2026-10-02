class Solution {
    public int change(int amount, int[] coins) {

        int[]dp = new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
            for(int a=1;a<=amount;a++){
                dp[a]=dp[a]+(a>=coin?dp[a-coin]:0);
            }
        }
        return dp[amount];
    }
}
