class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> op = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        opf(candidates,0,op,curr,target,0);
        return op;
    }
    private void opf(int[] candidates,int index,List<List<Integer>> op,List<Integer> curr,int target, int currSum){
        if(index==candidates.length){
            return;
        }
        if(currSum+candidates[index]==target){
            curr.add(candidates[index]);
            op.add(new ArrayList<>(curr));            
            curr.remove(curr.size() - 1);
        }
        else if(currSum+candidates[index]>target){
            return;
        }
        else{
            ArrayList<Integer> next = new ArrayList<>(curr);
            curr.add(candidates[index]);
            opf(candidates,index+1,op,curr,target,currSum+candidates[index]);
            int curr1 = candidates[index];
            while(index<candidates.length && candidates[index]==curr1){
                index++;
            }
            opf(candidates,index,op,next,target,currSum);
        }

    }

}
