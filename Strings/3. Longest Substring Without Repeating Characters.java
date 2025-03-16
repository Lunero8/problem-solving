class Solution {
    public int lengthOfLongestSubstring(String s) {
        // -- Optimized Way
        int size = s.length() ;
        int[] mark = new int[256] ;
        Arrays.fill(mark,-1) ;

        int r = 0 ;
        int l = 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            if (mark[s.charAt(i)] >= l) 
                l = mark[s.charAt(i)] + 1 ;
            
            r = Math.max (r, i+1-l) ;
            mark[s.charAt(i)] = i ; 
        }

        return r ;



        /*
        // - Optimized way
        int size = s.length() ;
        int[] a = new int [256] ;
        Arrays.fill(a,-1) ;
        int result = 0 ;
        int l = 0 ;
        // int r = 0 ;

        // if (size < 1)
        //     return 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            if (a[s.charAt(i)] >= l)
                l = a[s.charAt(i)] + 1 ;
                
            result = Math.max (i-l+1, result) ;
            a[s.charAt(i)] = i ;
        }

        return result ;
        */


        // - brute force way
        // int result = 0 ;
        // int temp = 1 ;
        // int size = s.length() ;
        // int l = 0 ;
        
        // if (size < 1)
        //     return 0 ;

        // for(int i = 1 ; i < size ; i++)
        // {
        //     for (int j = i-1 ; j >= l ; j--)
        //     {
        //         if (s.charAt(i) == s.charAt(j))
        //         {
        //             if (result < temp)
        //             {
        //                 result = temp ;
        //             }

        //             l = j+1 ;
        //             temp = i - j ;
        //         }
        //         else if (j == l)
        //             temp++ ;
        //     }
        // }

        // if (result < temp)
        //     result = temp ;
        
        // return result ;
    }
}