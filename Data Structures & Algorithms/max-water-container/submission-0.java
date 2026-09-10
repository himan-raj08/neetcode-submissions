class Solution {
    public int maxArea(int[] heights) {
        int n =heights.length;
        int left =0;
        int right =n-1;
        int maxArea =0;
        int length=0;
         while(left<right){
            int width =right -left;
            length =Math.min(heights[left],heights[right]);
            maxArea =Math.max(maxArea,(width*length));

            if(heights[left]<heights[right]){
                left++;
            }
            else {
                right--;
            }


        }
        return maxArea;

        
    }
}
