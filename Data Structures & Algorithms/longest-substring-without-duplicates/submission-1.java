class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int left =0;
        int n =s.length();
        int maxlen =0;

        for(int right =0;right<n;right++) {
             char ch =s.charAt(right);
              map.put(ch,map.getOrDefault(ch,0)+1);
           
            while(map.get(ch)>1) {
                char sh =s.charAt(left);
                map.put(sh,map.getOrDefault(sh,0)-1);
                if(map.get(sh)==0){
                    map.remove(sh);
                }
                 left++;
            }
             maxlen= Math.max(maxlen,(right-left+1));
        }
        return maxlen;
        
    }
}
