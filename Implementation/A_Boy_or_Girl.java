/**
 *    author:  Lunero
 *    created: 16.11.2025 06:57:08
**/
import java.util.* ;

public class A_Boy_or_Girl {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            String s = sc.next() ;

            Set<Character> set = new HashSet<>() ;

            for (char c : s.toCharArray())
                  set.add (c) ;

            System.out.println (set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!") ;

            /*  First Approach

            Scanner sc = new Scanner (System.in) ;

            String s = sc.next() ;

            int[] arr = new int [26] ;

            int count = 0 ;

            for (int i = 0 ; i < s.length() ; i++) {
                  if (arr[s.charAt(i) - 'a'] == 0) {
                        arr[s.charAt(i) - 'a'] = 1 ;
                        count++ ;
                  }
            }

            if (count % 2 == 0)
                  System.out.println ("CHAT WITH HER!") ;
            else
                  System.out.println ("IGNORE HIM!") ;
            
            */
      }
}