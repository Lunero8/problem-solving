class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("") ;

        Arrays.sort (strs) ;

        int i = 0 ;

        while (i < strs[0].length() && i < strs[strs.length - 1].length())
        {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
                result.append (strs[0].charAt(i)) ;
            else
                break ;
            
            i++ ;
        }

        return result.toString() ;
    }
}