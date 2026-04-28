class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        ArrayList<ArrayList<Integer>> op = new ArrayList<>();
        for(int i=temperatures.length-1;i>=0;i--){
            if(op.size()==0){
                ArrayList<Integer> push = new ArrayList<>();
                push.add(temperatures[i]);
                push.add(i);
                op.add(push);
                arr[i]=0;
            }
            else{
                while(op.size()!=0 && op.get(op.size()-1).get(0)<=temperatures[i]){
                    op.remove(op.size()-1);
                }
                if(op.size()==0){
                    arr[i]=0;
                }
                else{
                    arr[i]=op.get((op.size()-1)).get(1)-i;
                }
                ArrayList<Integer> push = new ArrayList<>();
                push.add(temperatures[i]);
                push.add(i);
                op.add(push);
            }
        }
        return arr;
    }
}
