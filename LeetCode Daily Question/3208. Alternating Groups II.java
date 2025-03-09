class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int result = 0 ;
        int size = colors.length ;
        int m = 1 ;

        for (int i = 1 ; i <= size+k-2 ; i++)
        {
            if (colors[i % size] != colors[(i-1+size) % size])
            {
                m++ ;
            }
            else
                m = 1 ;

            if(m >= k)
                result++ ;
        }

        return result ;
    }
}