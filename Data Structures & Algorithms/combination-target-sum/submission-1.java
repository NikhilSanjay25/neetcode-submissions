class Solution {
    List<List<Integer>> op = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer> test = new ArrayList<>();
        Arrays.sort(nums);
        rec(0,test,target,nums,0);
        return op;
    }
    private void rec(int index,ArrayList<Integer> list, int target,int[] nums,int sum){
        if(index>=nums.length){
            return;
        }
        if(sum+nums[index]==target){
            ArrayList<Integer> ret = new ArrayList<>(list);
            ret.add(nums[index]);
            op.add(ret);
            return;
        }
        else if(sum+nums[index]>target){
            return;
        }
        else{
            ArrayList<Integer> list2 = new ArrayList<>(list);
            list2.add(nums[index]);
            rec(index+1,list,target,nums,sum);
            rec(index,list2,target,nums,sum+nums[index]);
        }
    }
}
