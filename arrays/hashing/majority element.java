class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            
            if(map.contains(nums[i]))
        {
           int count = map.get(nums[i]);
           count = count+1;

          if(count>=n/3)
          {
             return true;
           }
        }
         map.put(nums[i],count);
       else{
             count++;
           }
         }return false;
        }
    }
