class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> op = new ArrayList<>();
        for(int i:nums){
            int indx = Collections.binarySearch(op,i);
            if(indx<0){
                indx = -(indx+1);
            }
            if(indx==op.size()){
                op.add(i);
            }
            else{
                if(op.get(indx)>i){
                op.set(indx,i);
                }
            }
        }
        return op.size();
    }
}
