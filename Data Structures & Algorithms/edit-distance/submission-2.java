class Solution {
    public int minDistance(String word1, String word2) {
        int min =Integer.MIN_VALUE;
        int i =word1.length()-1;
        int j =word2.length()-1;
        int[][] dp =new int[i+1][j+1];
        for(int[] row:dp) {
            Arrays.fill(row,-1);
        }
        return solve(word1, word2,i,j,dp);

    }
        public int solve(String word1,String word2,int i,int j,int[][] dp) {

            if(i<0){
                return j+1;
            }
               if(j<0){
                return i+1;
            }

            if(dp[i][j]!=-1)    
            return dp[i][j];

        if(word1.charAt(i) ==word2.charAt(j)){
            return solve(word1,word2,i-1,j-1,dp);
        }

        int insert =solve(word1,word2,i,j-1,dp);
        int delete =solve(word1,word2,i-1,j,dp);
        int replace =solve(word1,word2,i-1,j-1,dp);

       return dp[i][j]= 1+ Math.min(insert,Math.min(delete,replace));
        
    }
}
