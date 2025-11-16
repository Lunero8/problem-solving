/**
 *    author:  Lunero
 *    created: 16.11.2025 06:42:41
**/
import java.util.* ;

public class A_Bear_and_Big_Brother {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int a = sc.nextInt(), b = sc.nextInt() ;

            int count = 0 ;

            while (a <= b) {
                  a *= 3 ; 
                  b *=2 ;
                  count++ ;
            }

            System.out.println (count) ;
      }
}