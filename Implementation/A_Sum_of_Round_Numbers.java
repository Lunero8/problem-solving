/**
 *    author:  Lunero
 *    created: 23.08.2025 10:28:50
**/
import java.util.* ;

public class A_Sum_of_Round_Numbers {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int t = sc.nextInt() ;

            while (t-- > 0)
            {
                  int n = sc.nextInt() ;

                  ArrayList<Integer> r = new ArrayList<>() ;

                  int m = 10 ;

                  while (n > 0)
                  {
                        if (n % m != 0)
                              r.add (n % m) ;

                        n -= n % m ;
                        m *= 10 ;
                  }

                  System.out.println (r.size()) ;

                  for (int i : r)
                        System.out.print (i + " ") ;
                  
                  System.out.println() ;
            }
      }
}