class Solution {
    public int[][] kClosest(int[][] points, int k) {   
        PriorityQueue<int[]> op = new PriorityQueue<>((a,b)->Double.compare(
            Math.hypot(b[0],b[1]),
            Math.hypot(a[0],a[1])
        ));
        int c = 0;
        for(int[] arr : points){
            if(c<k){
                op.add(arr);
                c++;
            }
            else{
                op.add(arr);
                op.poll();
            }
        }
        int[][] out = new int[k][2];
        int i=0;
        while(op.size()!=0){
            int[] ar = op.poll();
            out[i][0]=ar[0];
            out[i][1]=ar[1];
            i++;
        }
        return out;
    }
}
