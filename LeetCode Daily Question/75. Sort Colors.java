class Solution {
    public void sortColors(int[] nums) {
        /*
        Arrays.sort(nums) ;
        System.out.print (Arrays.toString(nums)) ;
        */

        int[] r = new int [3] ;

        for (int i : nums)
            r[i]++ ;

        int index = 0 ;

        for (int i = 0 ; i < 3 ; i++)
        {
            while (r[i] > 0)
            {
                nums[index++] = i ;
                r[i]-- ;
            }
        }
    }
}