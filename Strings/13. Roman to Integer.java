class Solution {
    public int romanToInt(String s) {
        int count = 0 ;
        int size = s.length() ;

        for (int i = 0 ; i < size ; i++)
        {
            if (i < size-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X' )
            {
                count += 9 ;
                ++i ;
            }
            else if (i < size-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V' )
            {
                count += 4 ;
                ++i ;
            }
            else if (s.charAt(i) == 'I')
                count++ ;           
            else if (i < size-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L')
            {
                count += 40 ;
                ++i ;
            }
            else if (i < size-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C')
            {
                count += 90 ;
                ++i ;
            }
            else if (s.charAt(i) == 'X')
                count += 10 ;          
            else if (i < size-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D' )
            {
                count += 400 ;
                ++i ;
            }
            else if (i < size-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M')
            {
                count += 900 ;
                ++i ;
            }
            else if (s.charAt(i) == 'C')
                count += 100 ;           
            else if (s.charAt(i) == 'V')
                count += 5 ;
            else if (s.charAt(i) == 'L')
                count += 50 ;
            else if (s.charAt(i) == 'D')
                count += 500 ;
            else
                count += 1000 ;           
        }

        return count ;
    }
}