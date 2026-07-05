class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int i = 0;
        int j = n-1;
        int k = n-1;
        while(i<=j){
        if((nums[i]*nums[i])>(nums[j]*nums[j]))
        {
            result[k]=nums[i]*nums[i];
            i++;
            k--;
        }
        
        else{
            result[k]=nums[j]*nums[j];
            j--;
            k--;
        }
     }    return result;                                      
}
}

// in this problem we have i j for given array and k for result array k is an empty array where 
// we will store thr values of the largest squares from the end in result array 
// important thing is k is not pointer for nums array its only for resultant array for storing 
// in this problem creating new array is imp
// remaining is same like merge two sorted array problem 