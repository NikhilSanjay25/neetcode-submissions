class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]=='O' & (i==0 || j==0 || i==n-1 || j==m-1)){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] ar = q.poll();
            int[][] visited = new int[n][m];
            dfs(ar[0],ar[1],board,visited);
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j]=='O' ){
                    board[i][j]='X';
                }
                if(board[i][j]=='S'){
                    board[i][j]='O';
                }
            }
        }
    }
    private void dfs(int x,int y,char[][] board,int[][] visited){

        if(x<0 || y<0 || x>=board.length || y>=board[0].length || visited[x][y]==1){
            return;
        }
        visited[x][y]=1;
        if(board[x][y]=='X'){
            return;
        }
        if(board[x][y]=='O'){
            board[x][y]='S';
            dfs(x+1,y,board,visited);
            dfs(x-1,y,board,visited);
            dfs(x,y+1,board,visited);
            dfs(x,y-1,board,visited);
        }
    }
}
