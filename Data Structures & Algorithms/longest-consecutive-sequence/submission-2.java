class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count = 0;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            System.out.println(nums[i]);
            if(nums[i-1]==nums[i]-1){
                curr++;
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                count = Math.max(count,curr);
                curr=1;
            }
        }   
        count = Math.max(count,curr);
        return count;
    }
}
