class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> op = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            op.add(i);
        }
        while(op.size()>1)
        {
            int a = op.poll();
            int b = op.poll();
            if(a==b){
                continue;
            }
            else{
                op.add(a-b);
            }
        }
        if(op.size()==0)
        {
            return 0;
        }
        int a = op.poll();
        return a;
    }
}
