class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 =new HashMap<>();
         HashMap<Character,Integer> map2 =new HashMap<>();

         for(char ch: s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
         }
         int left =0;
         for(int right=0;right<s2.length();right++) {
            char ch =s2.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            while((right-left+1)>s1.length()){
                char sh= s2.charAt(left);
                map2.put(sh,map2.getOrDefault(sh,0)-1);
                if(map2.get(sh)==0){
                    map2.remove(sh);
                }
                left++;
            }
            if(map1.equals(map2)){
                return true;
            }

         }
         return false;

        
    }
}
