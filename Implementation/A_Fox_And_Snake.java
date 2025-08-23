/**
 *    author:  Lunero
 *    created: 23.08.2025 10:44:02
**/
import java.util.* ;

public class A_Fox_And_Snake {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int a = sc.nextInt() , b = sc.nextInt() ;

            for (int i = 1 ; i <= a ; i++)
            {
                  for (int j = 1 ; j <= b ; j++)
                  {
                        if (i % 2 != 0 || i % 4 == 0 && j == 1 || i % 4 != 0 && j == b)
                              System.out.print ("#") ;
                        else
                              System.out.print (".") ;
                  }

                  System.out.println () ;
            }
      }
}