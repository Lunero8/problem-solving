class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        // time limit
/*
        for (int i = 0 ; i < queries.length ; i++)
            for (int j = queries[i][0] ; j <= queries[i][1] ; j++)
                nums[j]-- ;

        for (int i = 0 ; i < nums.length ; i++)
            if (nums[i] > 0)
                return false ;
        
        return true ;
*/

        int size = nums.length ;
        int[] d = new int [size + 1] ;

        for (int[] n : queries)
        {
            int s = n[0] ;
            int e = n[1] ;

            d[s] -= 1 ;
            
            if (e + 1 < size)
                d[e + 1] += 1 ;
        }

        int c = 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            c += d[i] ;
            nums[i] += c ;

            if (nums[i] > 0)
                return false ;
        }

        return true ;
    }
}     