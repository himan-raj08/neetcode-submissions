class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        boolean[] freq =new boolean[nums.length];
        solve(nums,ds,ans,freq);
        return ans;
    }
      public void solve(int[] nums, List<Integer> ds,
                      List<List<Integer>> ans, boolean[] freq) {
                        int n =nums.length;
        if(ds.size() ==n) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<n;i++) {
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i] =true;
                solve(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] =false;
            }
        }
                      }
}
