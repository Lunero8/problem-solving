/**
 *    author:  Lunero
 *    created: 23.08.2025 16:36:54
**/
import java.util.* ;

public class A_In_Search_of_an_Easy_Problem {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int n = sc.nextInt() ;

            boolean hard = false ;

            while (n-- > 0)
            {
                  int a = sc.nextInt() ;

                  if (a == 1)
                        hard = true ;
            }

            if (hard == true)
                  System.out.println ("HARD") ;
            else 
                  System.out.println ("EASY") ;
      }
}