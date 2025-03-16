class Solution {
    public int numberOfSubstrings(String s) {
        int result = 0 ;
        int[] last_seen_index = {-1,-1,-1} ; // index 0 = 'a', index 1 = 'b', index 2 = 'c' ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            last_seen_index[s.charAt(i) - 'a'] = i ;

            if (last_seen_index[0] != -1 && last_seen_index[1] != -1 && last_seen_index[2] != -1)
                result += 1 + Math.min (last_seen_index[0], Math.min (last_seen_index[1], last_seen_index[2])) ;
        }

        return result ;
        
        // Time Limit Exceeded
        /*
        int size = s.length() ;
        int result = 0 ;

        for (int i = 0 ; i < size-2 ; i++)
        {
            for (int j = i+2 ; j < size ; j++)
            {
                String temp = s.substring(i,j+1) ;

                if (temp.contains("a") && temp.contains("b") && temp.contains("c"))
                    result++ ;
            }
        }

        return result ;
        */
    }
}