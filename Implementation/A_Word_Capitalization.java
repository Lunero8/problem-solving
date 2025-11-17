/**
 *    author:  Lunero
 *    created: 17.11.2025 14:49:54
**/
import java.util.* ;

public class A_Word_Capitalization {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            StringBuilder s = new StringBuilder(sc.next()) ;

            if (s.charAt(0) > 96) {
                  s.setCharAt(0, (char)(s.charAt(0) - 32)) ;
            }

            System.out.println (s) ;
      }
}