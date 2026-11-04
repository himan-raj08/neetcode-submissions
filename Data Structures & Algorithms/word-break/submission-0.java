class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp =new Boolean[s.length()];

       return solve(0, s, wordDict, dp);
        
    }
public boolean solve(int index, String s,
              List<String> wordDict, Boolean[] dp) {

if(index ==s.length()) return true;
  for(String word: wordDict){
    int len =word.length();
        if (dp[index] != null) {
         return dp[index];
        }

              if (index + len <= s.length() &&
                s.substring(index, index + len).equals(word)) {
            if(solve(index+len,s,wordDict,dp)) {
                return dp[index] =true;
            }
         }
  }
  return dp[index] =false;
                         }
}
