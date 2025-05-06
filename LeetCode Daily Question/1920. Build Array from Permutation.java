class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length ;
        int[] r = new int[size] ;

        for (int i = 0 ; i < size ; i++)
        {
            r[i] = nums[nums[i]] ;
        }

        return r ;
    }
}