package math;

public class sqrt {
    class Solution {
    public int mySqrt(int x) {
        int low =0;
        int high=x;
        int ans=0;
        while(low<=high){
         int mid = (low+high)/2;
        if((long)mid*mid<=x)
        {
            ans=mid;
            low=mid+1;

        }
        else if((long)mid*mid>x){
            high=mid-1;
        }
        else{
            if((long)mid*mid==x){
            return mid;
            }
        }
    }return ans;
    }
}
}
// used binary search to find the sqrt of a number because if we take the mid and multiply it with itself if it
// is less than the number then we can move the low pointer to mid+1 because we have to find the max value of sqrt
// so when we want sqrt of a number we can use binary search algorithm
// first calculate a mid and it becomes easy the