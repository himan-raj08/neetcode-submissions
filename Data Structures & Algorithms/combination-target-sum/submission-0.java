class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(0,nums,target,ds,ans);

        return ans;
    }
       public void solve(int index, int[] nums, int target,
                      List<Integer> ds, List<List<Integer>> ans) {

 if (target == 0) { ans.add(new ArrayList<>(ds)); 
 return; } 
 
 
 if (index == nums.length) { return; }

        //take case
        if(nums[index]<=target) {
            ds.add(nums[index]);
       solve(index,nums,target-nums[index],ds,ans);
        ds.remove(ds.size()-1);
}
//not take
     solve(index+1,nums,target, ds,ans);
    }
}
