class Solution {
    public String largestOddNumber(String num) {
        int l = num.length()-1 ;

        while (l >= 0)
        {
            if ((num.charAt(l) - '0')% 2 != 0)
                return num.substring(0,l+1) ;
            
            l-- ;
        }

        return "" ;
    }
}