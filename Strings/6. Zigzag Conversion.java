/**
 *    author:  Lunero
 *    created: 30.07.2025 15:26:43
 *    link: https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s ;
            
        StringBuilder result = new StringBuilder() ;
        StringBuilder[] storeByRow = new StringBuilder[numRows] ;

        for (int i = 0 ; i < numRows ; i++)
        {
            storeByRow[i] = new StringBuilder () ;
        }

        boolean reverse = false ;
        int iterate = 0 ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            if (iterate == 0)
                reverse = false ;
            else if (iterate == numRows - 1)
                reverse = true ;

            if (reverse == false)
            {
                storeByRow[iterate].append (s.charAt(i)) ;
                iterate++ ;
            }

            if (reverse == true)
            {
                storeByRow[iterate].append (s.charAt(i)) ;
                iterate-- ;
            }
        }

        for (int i = 0 ; i < numRows ; i++)
        {
            result.append (storeByRow[i]) ;
        }

        return result.toString() ;
    }
}