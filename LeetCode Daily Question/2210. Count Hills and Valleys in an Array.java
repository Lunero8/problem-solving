/**
 *    author:  Lunero
 *    created: 27.07.2025 21:11:05
**/

class Solution {
    public int countHillValley(int[] nums) {
        int[] numsWithOutDuplicate = new int[nums.length] ;
        
        int count = 0 ;

        numsWithOutDuplicate[0] = nums[0] ;
        int fill = 0 ;

        // removing duplicates
        for (int i = 1 ; i < nums.length ; i++)
            if (nums[i] != numsWithOutDuplicate[fill])
                numsWithOutDuplicate[++fill] = nums[i] ;

        // counting the final result
        for (int i = 1 ; i < fill ; i++)
            if (numsWithOutDuplicate[i] > numsWithOutDuplicate[i-1] && numsWithOutDuplicate[i] > numsWithOutDuplicate[i+1])
                count++ ;
            else if (numsWithOutDuplicate[i] < numsWithOutDuplicate[i-1] && numsWithOutDuplicate[i] < numsWithOutDuplicate[i+1])
                count++ ;

        return count ;
    }
}