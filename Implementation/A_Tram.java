/**
 *    author:  Lunero
 *    created: 23.08.2025 18:21:55
**/
import java.util.* ;

public class A_Tram {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int n = sc.nextInt() ;

            int count = 0 ;
            int max = 0 ;

            while (n-- > 0)
            {
                  int a = sc.nextInt() , b = sc.nextInt() ;

                  count += (b-a) ;
                  /*
                  count -= a ;
                  count += b ;
                  */

                  if (max < count)
                        max = count ;
            }

            System.out.println (max) ;
      }
}