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
// here this prob is not fixed size it is dynamic size but we should return min leng of subarray
// whose value is >= target we used two pointers we just have to intialize sum where beginning
// sum=sum+nums[right] which means everytime we are adding right pointer value to sum
// then we have while loop which checks if sum is greater than or equal to target then we will check the min length of subarray
// intially we intialized min_len to nums.length+1 because we want to find the minimum length of subarray whose sum is greater than or equal to target
// if we intialize min_len to 0 then we will always get 0 as output because we are checking for min length of subarray 
// if we intialize some bigger value then we will get the correct output because we are checking for min length of subarray 
// at the end we will check if min_len is still equal to nums.length+1 then we will return 0 
