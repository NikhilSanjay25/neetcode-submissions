class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> op = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(j<k){
                int sum = nums[j]+nums[k];
                if(sum==target){
                    ArrayList<Integer> add = new ArrayList<>();
                    add.add(nums[i]);
                    add.add(nums[j]);
                    add.add(nums[k]);
                    op.add(add);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                }
                if(sum<=target){
                    j++;
                }
                if(sum>target){
                    k--;
                }
            }
        }
        return op;
    }
}
