class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        op.add(arr1);
        List<Integer> arr2 = new ArrayList<>();
        subsets1(nums,0,op,arr2);
        return op;
    }
    private void subsets1(int[] nums,int index,List<List<Integer>> op,List<Integer> curr){
        if(index==nums.length){
            return;
        }
        List<Integer> n1 = new ArrayList<>(curr);
        curr.add(nums[index]);
        op.add(curr);
        List<Integer> n2 = new ArrayList<>(curr);
        subsets1(nums,index+1,op,n1);
        subsets1(nums,index+1,op,n2);
    }
}
