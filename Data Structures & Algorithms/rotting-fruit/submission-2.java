class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int[][] dir = { {0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] ar = q.poll();
            int i = ar[0];
            int j = ar[1];
            for(int[] a:dir){
                int r = i+a[0];
                int l = j+a[1];
                if(r<0 || r>=n || l<0 || l>=m || grid[r][l]==0 || grid[r][l]!=1){
                    continue;
                }
                grid[r][l]=grid[i][j]+1;
                q.add(new int[]{r,l});
            }
        }
        int max = 2;
        for(int[] a:grid){
            for(int i:a){
                if(i>max){
                    max=i;
                }
                if(i==1){
                    return -1;
                }
            }
        }
        System.out.println(max);
        return max-2;
    }
}
