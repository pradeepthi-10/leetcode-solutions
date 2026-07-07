class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int min_len=nums.length+1;
        for(right=0;right<nums.length;right++)
        {
            sum += nums[right];
            while(sum >= target){
                min_len = Math.min(min_len,right-left+1);
                sum -= nums[left];
                left++;
                
            }
        }  if (min_len == nums.length + 1) {
           return 0;
          } else {
           return min_len;
          }
    }
}