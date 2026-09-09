class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num,1);
        }
        int maxlen =0;
        for(int num:nums) {
            if(!map.containsKey(num-1)) {
                int curr =num;
                int count=1;
            
           while(map.containsKey(curr+1)){
                count++;
                curr++;
            }
            
            maxlen =Math.max(maxlen,count);
            }
        }
        return maxlen;
        
    }
}
