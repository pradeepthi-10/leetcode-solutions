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