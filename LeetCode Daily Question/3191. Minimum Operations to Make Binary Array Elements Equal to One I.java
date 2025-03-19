class Solution {
    public int minOperations(int[] nums) {
        int size = nums.length ;
        int result = 0 ;

        for (int i = 0 ; i < size-2 ; i++)
        {
            if (nums[i] == 0)
            {
                nums[i] ^= 1 ;
                nums[i+1] ^= 1 ;
                nums[i+2] ^= 1 ;

                result++ ;
            }
        }

        for (int num : nums)
        {
            if (num == 0)
                return -1 ;
        }

        return result ;        
    }
}