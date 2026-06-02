class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int count = 1;
        int[][] op = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            op[i][0]=position[i];
            op[i][1]=speed[i];
        }
        Arrays.sort(op,(a,b)->Integer.compare(b[0],a[0]));
        for(int[] row:op){
            System.out.println(row[0]+" "+row[1]);
            
        }
        double prev = (double)(target-op[0][0])/op[0][1];
        for(int i=1;i<op.length;i++){
            double time = (double)(target-op[i][0])/op[i][1];
            if(time>prev){
                count++;
                prev = time;
            }
        }
        return count;
    }
}
