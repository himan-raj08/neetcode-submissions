class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n =grid.length;
        int m =grid[0].length;
        boolean[][] vis =new boolean[n][m];
        Queue<int[]> q =new LinkedList<>();
         int maxArea = 0;
       

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] ==1 && !vis[i][j]){
                      int area =0;
                    q.add(new int[]{i,j});
                    vis[i][j] =true;

                    while(!q.isEmpty()) {
                        int[] curr =q.poll();
                        int r=curr[0];
                        int c = curr[1];
                        area++;
                for (int k = 0; k < 4; k++) {

                 int nr = r + dr[k];
                 int nc = c + dc[k];
                 if(nr>=0 && nc>=0 && nr<n && nc<m &&
                 grid[nr][nc]==1 && !vis[nr][nc]) {
                 q.add(new int[]{nr,nc});
                 vis[nr][nc] =true;

                 }

                             }
                             maxArea =Math.max(maxArea,area);
                    }
                }
            }
        }
        return maxArea;

        
    }
}
