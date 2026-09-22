class Solution {
    public void islandsAndTreasure(int[][] grid) {
       int n = grid.length;
       int m = grid[0].length;
       Queue<int[]> q = new LinkedList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0){
                q.add(new int[]{i,j});
            }
        }
       }
       if(q.size()==0){
        return;
       } 
       int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
              while(!q.isEmpty()){
        int[] node = q.poll();
        int x = node[0];
        int y = node[1];
        for(int[] ar:dir){
            int r = x+ar[0];
            int l = y+ar[1];
            if(r<0 ||r>=n||l<0||l>=m||grid[r][l]!=Integer.MAX_VALUE){
                continue;
            }
            q.add(new int[]{r,l});
            grid[r][l]=Math.min(grid[r][l],grid[x][y]+1);
        }
       }

    }
}