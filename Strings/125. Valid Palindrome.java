class Solution {
    public boolean isPalindrome(String s) {
        int l = 0 , r = s.length()-1 ;

        while (l < r)
        {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++ ;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r-- ;
            
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false ;
            
            l++ ;
            r-- ;
        }

        return true ;
        


        
        
        
        
        
        
        /*
        int size = s.length() ;

        StringBuilder sb = new StringBuilder ("") ;

        for (int j = 0 ; j < size ; j++)
        {
            if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
                // sb.append(s.charAt(j)+32) ;
                sb.append(Character.toLowerCase(s.charAt(j))) ;

            else if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9')
                sb.append(s.charAt(j)) ;
        }

        size = sb.length() ;

        for (int i = 0 ; i < size/2 ; i++)
        {
            if (sb.charAt(i) != sb.charAt(size-1-i))
                return false ;
        }
    
    
        return true ;

        */






        
        /*
        int size = s.length() ;

        int i = 0 ;
        char[] n = new char[size] ;

        for (int j = 0 ; j < size ; j++)
        {
            if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') 
            {
                // n[i] = s[j]+32 ;
                n[i] = Character.toLowerCase(s.charAt(j)) ;
                i++ ;
            }
            else if (s.charAt(j) >= '0' && s.charAt(j) <= '9')
            {
                n[i] = s.charAt(j) ;
                i++ ;
            }
            else if (s.charAt(j) < 'a' || s.charAt(j) > 'z')
            {
                continue ;
            }
            else
            {
                n[i] = s.charAt(j) ;
                i++ ;
            }
        }

        // boolean r = true ;

        // i++ ;

        for (int k = 0 ; k < i/2 ; k++)
        {
            // if (n.charAt(k) != n.charAt(size-1-k))
            if (n[k] != n[i-1-k])
                return false ;
        }

        return true ;
        */
    }
}