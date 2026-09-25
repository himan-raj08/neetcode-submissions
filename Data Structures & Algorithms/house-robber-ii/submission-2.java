class Solution {
    public int rob(int[] nums) {
      int n =nums.length;
       if(n==1) return nums[0];
    
      int[] dp =new int[n];
       
      Arrays.fill(dp,-1);

      int case1 =solve(nums,0,n-2,dp);
      Arrays.fill(dp,-1);
      int case2 =solve(nums,1,n-1,dp);

      return Math.max(case1,case2);
    }
    public int solve(int[] nums,int i,int end,int[] dp) {
        int n =nums.length;

        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];


        int take =solve(nums,i+2,end,dp) +nums[i];
        int notTake =solve(nums,i+1,end,dp);

        return dp[i]=Math.max(take,notTake);
    }
}
