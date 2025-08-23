/**
 *    author:  Lunero
 *    created: 23.08.2025 16:11:26
**/
import java.util.* ;

public class A_Arrival_of_the_General {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int n = sc.nextInt() ;

            int max = -1 ;
            int min = 101 ;
            int maxIndex = 0;
            int minIndex = 0;

            for (int i = 0 ; i < n ; i++)
            {
                  int a = sc.nextInt() ;

                  if (a > max)
                  {
                        max = a ;
                        maxIndex = i ;
                  }

                  if (a <= min)
                  {
                        min = a ;
                        minIndex = i ;
                  }

            }

            if (maxIndex > minIndex)
                  System.out.println (maxIndex + (n - minIndex - 1) - 1) ;
            else 
                  System.out.println (maxIndex + (n - minIndex - 1)) ;
      }
}