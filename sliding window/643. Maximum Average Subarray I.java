class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int right=k-1;
        int sum = 0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum;

        for(right=k;right<nums.length;right++)
        {
          sum+=nums[right];
          sum-=nums[right-k];
          max=Math.max(sum,max);

        }
        return (double)max/k;
    }

    }
    // her in this prob we have to find the max average of sub array first if add is more avg will be more
    // hence to find the max the size of subarray is fixed that is k first add the elements of k size subarray from beggining
    // after addinng we then use a for loop in which right pointer is traversed untill the end
    // now also remember to give sum= max because we use the formula math.max(sum,max) to find the max sum of subarray 
    // in that formula max becomes intial sum and we also have to remove left pointer value from sum because we are moving the window to
    // right and we have to add the right pointer value to sum because we are moving the window to right 
    // at the end we will return the max sum/k because