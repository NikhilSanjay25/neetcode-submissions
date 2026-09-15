class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int[][] dp = new int[2*sum+1][nums.length];
        for(int[] arr:dp){
            Arrays.fill(arr,sum+1);
        }
        if(target > sum || target < -sum)
            return 0;
        return rec(nums,target,0,dp,sum);
    }
    private int rec(int[] nums,int target,int index,int[][] dp,int sum){
        if (target > sum || target < -sum) {   // <-- add this
        return 0;
    }
        if(index==nums.length && target==0){
            return 1;
        }
        else if(index==nums.length){
            return 0;
        }
        else{
            int val1 = target-nums[index];
            int val2 = target+nums[index];
            if(dp[target+sum][index]!=(sum+1)){
                return dp[target+sum][index];
            }
            int ans = rec(nums,val1,index+1,dp,sum)+rec(nums,val2,index+1,dp,sum);
            dp[target+sum][index]=ans;
            return ans;
        }
        
    }
}