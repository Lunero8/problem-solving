class Solution {
    public String longestCommonPrefix(String[] strs) {
        // first approch
        // /*
        StringBuilder result = new StringBuilder () ;

        Arrays.sort(strs) ;

        String f = strs[0] ;
        String l = strs[strs.length-1] ;

        for (int i = 0 ; i < Math.min(f.length(), strs[strs.length-1].length()) ; i++)
        {
            if (f.charAt(i) != l.charAt(i))
                return result.toString() ;
                // return String.valueOf(result) ;

            
            result.append(f.charAt(i)) ;
        }

        return String.valueOf(result) ;
        // return result.toString ;

        // */


        // Second Try -
        // Optimized way no need to sorting the array
    }
}