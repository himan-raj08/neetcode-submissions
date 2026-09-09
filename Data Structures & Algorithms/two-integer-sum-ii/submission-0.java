class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n =numbers.length;
        int left =0;
        int right =n-1;

        while(left<right) {
            if(target ==(numbers[left]+ numbers[right])) {
                return new int[]{left+1,right+1};
            }
            else if(target<(numbers[left]+numbers[right])) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{};
        
    }
}
