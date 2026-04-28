class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> op = new HashSet<>();
        for(int i:nums){
            if(op.contains(i)){
                return true;
            }
            op.add(i);
        }
        return false;
    }
}