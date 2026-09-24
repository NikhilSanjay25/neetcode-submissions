class Solution {
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(i,0,pac,heights);
            dfs(i,m-1,atl,heights);
        }
        for(int i=0;i<m;i++){
            dfs(0,i,pac,heights);
            dfs(n-1,i,atl,heights);
        }
        List<List<Integer>> op = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pac[i][j] && atl[i][j]){
                    List<Integer> ad = new ArrayList<>();
                    ad.add(i);
                    ad.add(j);
                    op.add(ad);
                }
            }
        }
        return op;
    }
    private void dfs(int x,int y,boolean[][] ocean,int[][] heights ){
        ocean[x][y]=true;
        for (int[] d : directions) {
            int nr = x + d[0], nc = y + d[1];
            if (nr >= 0 && nr < heights.length &&
                nc >= 0 && nc < heights[0].length &&
                !ocean[nr][nc] && heights[nr][nc] >= heights[x][y]) {
                dfs(nr, nc, ocean, heights);
            }
        }
    }
}
