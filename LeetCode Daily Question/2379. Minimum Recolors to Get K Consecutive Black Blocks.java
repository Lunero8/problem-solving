class Solution {
    public int minimumRecolors(String blocks, int k) {
        int result = 0 ;

        for (int i = 0 ; i < k ; i++)
        {
            if (blocks.charAt(i) == 'B')
                result++ ;
        }

        int max = result ;

        if (max == k)
            return 0 ;

        for (int i = k ; i < blocks.length() ; i++)
        {
            result += (blocks.charAt(i) == 'B' ? 1 : 0) - (blocks.charAt(i-k) == 'B' ? 1 : 0) ;

            if (result == k)
                return 0 ;

            if (max < result)
                max = result ;
        }

        return k-max ;
    }
}