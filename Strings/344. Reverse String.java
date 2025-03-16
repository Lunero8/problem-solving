class Solution {
    public void reverseString(char[] s) {
        int size = s.length ;
        
        for (int i = 0 ; i < size/2 ; i++)
        {
            // swap (s[i], s[size-1-i]) ;
            char temp = s[i] ;
            s[i] = s[size-1-i] ;
            s[size-1-i] = temp ;
        }

        // for (int i = size-1 ; i >= 0 ; i--)
        //     // return s[i] ;
        //     System.out.print () ;
       
    }
}