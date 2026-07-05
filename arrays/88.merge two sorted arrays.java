class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=nums1(m-1);
        int j = nums1(m+n-1);
        int k = nums2(n-1);
       while(k>=0)
       {
        if(i>=0){
        if(nums1[i]<=nums2[k])
        {
            nums1[j]=nums2[k];
            j--;
            k--;
        }
        else{
            nums1[j]=nums1[i];
            j--;
            i--;
        }
       }
       else{
        nums1[j]=nums2[k];
        j--;
        k--;

       }
       }
    }  
    }


    // understanding the problem
    we used 3 pointers here and we are cpying elements in 2 nd array into first array from the back
    eg 1:[1,2,3,0,0,0]   2:[2,5,6]
    first we have i pointer at 3 j at last 0 and k at 6 in 2nd array 
    first 6 is copied at j then 5 at j-1 then comparing 2 with 3 2 is less than 3
    hence,first a copy of 3 is made at next 0 which means i pointer value copied at j 
    then first loop runs again j will be at index 1 at element 2 and k is also pointing to element2 
    hence loop runs and old 3 changes to 2 thats it