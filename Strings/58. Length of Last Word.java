class Solution {
    public int lengthOfLastWord(String s) {
        
        // Method 1 high time limit
        /*
        int size = s.length() ;

        int result = 0 ;
        int pre = 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            if (s.charAt(i) == ' ')
            {
                if (result > 0)
                    pre = result ;
                result = 0 ;
            }
            else
                result++ ;
        }

        if (result == 0)
            result = pre ;

        return result ;
        */


        // Method 2 and the best :
        // /*
        int result = 0 ;

        int sizeIndex = s.length()-1 ;

        while (sizeIndex >= 0) 
        {
            if (result == 0 && s.charAt(sizeIndex) == ' ')
                sizeIndex-- ;
            else if (s.charAt(sizeIndex) == ' ')
                break ;
            else
            {
                result++ ;
                sizeIndex-- ;
            }
        }

        return result ;
        // */
    }
}