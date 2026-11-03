class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n =matrix.length;
        int m =matrix[0].length;

        int[][] dp =new int[n+1][m+1];

        int ans =0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                ans =Math.max(ans,solve(matrix,i,j,dp));
            }
        }
        return ans;
    }

        public int solve(int[][] matrix, int i, int j, int[][] dp) {

        int n = matrix.length;
        int m = matrix[0].length;

      if(dp[i][j] != 0)
          return dp[i][j];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int ans = 1;

        for(int k=0;k<4;k++) {
            int x =i+ dx[k];
            int y =j+ dy[k];

            if(x>=0 && y>=0 && x<n && y<m &&
            matrix[x][y]> matrix[i][j]){
                  ans = Math.max(ans, 1 + solve(matrix, x, y, dp));
            }
        }
    return dp[i][j] = ans;
        }
}
