class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> op = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(op.containsKey(target-nums[i])){
                return new int[]{op.get(target-nums[i]),i};
            }
            op.put(nums[i],Math.min(op.getOrDefault(nums[i],i),i));
            
        }
        return new int[] {0,0};
    }
}
