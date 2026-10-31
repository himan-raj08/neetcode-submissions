class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds =new ArrayList<>();
        solve(0,nums,ds);
        return ans;
    }
     public void solve(int index, int[] nums, List<Integer> ds) {
      ans.add(new ArrayList<>(ds));

        for(int i=index;i<nums.length;i++) {
            
            ds.add(nums[i]);
            solve(i+1,nums,ds);
            ds.remove(ds.size()-1);
        }


     }
}
