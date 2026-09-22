class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n =piles.length;
        int ans =0;
        int low =1;
        int high =0;
        for(int i=0;i<n;i++){
         high =Math.max(high,piles[i]);
        }
        while(low<=high){
             long totalhours =0;
        int mid =(low+high)/2;
        for(int pile:piles) {
            totalhours +=(pile+mid-1)/mid;
        }
            if(totalhours<=h){
                ans =mid;
                high =mid-1;
            } else {
                low =mid+1;
            }
            
        

}
return ans;
    }
 
    }

