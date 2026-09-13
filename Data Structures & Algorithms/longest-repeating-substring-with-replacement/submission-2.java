class Solution {
    public int characterReplacement(String s, int k) {
        int n =s.length();
        int[] freq =new int[26];
        int left =0;
        int maxfreq=0;
        int maxlength=0;
        for(int right =0;right<n;right++) {
            int freqn =freq[s.charAt(right)-'A']++;
            maxfreq =Math.max(maxfreq,freq[s.charAt(right)-'A']);
            if((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
                
            }
              int length =right-left+1;
            maxlength =Math.max(maxlength,length);
        }
        return maxlength;
        
    }
}
