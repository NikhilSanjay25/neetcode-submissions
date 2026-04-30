class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
       
        Arrays.fill(dp,Integer.MAX_VALUE-2);
        dp[0]=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length && j<=i+nums[i];j++){
                dp[j]=Math.min(dp[j],dp[i]+1);
            }
        }
        return dp[nums.length-1];
    }
}
