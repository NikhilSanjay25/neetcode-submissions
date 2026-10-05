class Solution {
    public int maxProduct(int[] nums) {
        int max  =1;
        int min = 1;
        int res = nums[0];
        for(int i:nums){
            int tmp = max*i;

            max = Math.max(i,Math.max(max*i,min*i));
            min = Math.min(tmp,Math.min(min*i,i));
            res = Math.max(res,max);
        }
        return res;
    }
}
