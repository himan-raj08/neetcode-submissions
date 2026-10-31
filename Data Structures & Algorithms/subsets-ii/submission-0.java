class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp =new ArrayList<>();
        solve(0,nums,temp);
        return ans;
    }
    public void solve(int index, int[] nums, List<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for( int i =index;i<nums.length;i++) {
            if(i>index && nums[i] ==nums[i-1]) {
                continue;
            }

            temp.add(nums[i]);
            solve(i+1,nums,temp);
            temp.remove(temp.size()-1);

        }
    }
}
