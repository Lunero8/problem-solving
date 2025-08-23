/**
 *    author:  Lunero
 *    created: 23.08.2025 18:00:48
**/
import java.util.* ;

public class A_Nearly_Lucky_Number {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            // Approach 2
            String s = sc.next() ;

            long count = s.chars().filter(c -> c == '7' || c == '4').count() ;

            System.out.println ((count == 7 || count == 4) ? "YES" : "NO") ;

            /* --Approach 1
            String s = sc.next() ;

            int count = 0 ;

            int i = 0 ;

            while (i < s.length())
            {
                  if (s.charAt(i) == '7' || s.charAt(i) == '4')
                        count++ ;
                  
                  i++ ;
            }

            if (count == 7 || count == 4)
                  System.out.println ("YES") ;
            else
                  System.out.println ("NO") ;
            */
      }
}