class Solution {
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==1){
                    continue;
                }
                else if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,visited,i,j);
                }
                else{
                    continue;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int[][] visited,int i,int j){
        int l = visited.length;
        int b = visited[0].length;
        if(i+1<l && grid[i+1][j]=='1' && visited[i+1][j]!=1){
            visited[i+1][j]=1;
            dfs(grid,visited,i+1,j);
        }
        if(j+1<b && grid[i][j+1]=='1' && visited[i][j+1]!=1){
            visited[i][j+1]=1;
            dfs(grid,visited,i,j+1);
        }
        if(i-1>=0 && grid[i-1][j]=='1' && visited[i-1][j]!=1){
            visited[i-1][j]=1;
            dfs(grid,visited,i-1,j);
        }
        if(j-1>=0 && grid[i][j-1]=='1' && visited[i][j-1]!=1){
            visited[i][j-1]=1;
            dfs(grid,visited,i,j-1);
        }
    }
}
