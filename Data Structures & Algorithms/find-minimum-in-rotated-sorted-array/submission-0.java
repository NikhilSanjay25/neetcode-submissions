class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = (right+left)/2;
        while(right>left){
            mid = (right+left)/2;
            if(nums[mid]>nums[right]){
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return nums[left];
    }
}
