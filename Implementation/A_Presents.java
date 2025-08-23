/**
 *    author:  Lunero
 *    created: 23.08.2025 16:49:51
**/
import java.util.* ;

public class A_Presents {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int n = sc.nextInt() ;

            int[] result = new int[n+1] ;

            for (int i = 1 ; i <= n ; i++)
            {
                  int a = sc.nextInt() ;

                  result[a] = i ;
            }

            for (int i = 1 ; i <= n ; i++)
                  System.out.print (result[i] + " ") ;
      }
}