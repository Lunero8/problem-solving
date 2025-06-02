class Solution {
    public int candy(int[] ratings) {
        int s = ratings.length ;
        int r = 0 ;

        int[] p = new int[s] ;
        Arrays.fill (p, 1) ;

        for (int i = 1 ; i < s ; i++)
        {
            if (ratings[i] > ratings[i-1])
                p[i] = p[i-1] + 1 ;
        }

        for (int i = s-1 ; i > 0 ; i--)
        {
            if (ratings[i-1] > ratings[i])
                p[i-1] = Math.max (p[i-1], p[i] + 1) ;

                r += p[i-1] ;
        }

        return r + p[s-1] ;
    }
}