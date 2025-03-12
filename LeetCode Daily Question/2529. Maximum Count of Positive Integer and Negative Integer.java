class Solution {
    public int maximumCount(int[] nums) {
        int l = 0 ;
        int r = nums.length ;

        while (l < r)
        {
            int mid = l + (r-l) / 2 ;

            if (nums[mid] < 0)
                l = mid+1 ;
            else
                r = mid ;               
        }

        int n = l ;

        l = 0 ;
        r = nums.length ;

        while (l < r)
        {
            int mid = l + (r-l) / 2 ;

            if (nums[mid] < 1)
                l = mid+1 ;
            else
                r = mid ;               
        }

        int p = nums.length - l ;

        return Math.max (n,p) ;



        // brute force

        /*
        int size = nums.length ;
        int p = 0 ;
        int n = 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            if (nums[i] > 0)
                p++ ;
            else if (nums[i] < 0)
                n++ ;
        }

        return p > n ? p : n ;
        */
    }
}