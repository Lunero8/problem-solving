/**
 *    author:  Lunero
 *    created: 24.08.2025 22:12:39
**/
import java.util.* ;

public class A_Soldier_and_Bananas {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int a = sc.nextInt() , b = sc.nextInt(), c = sc.nextInt() ;

            long price = 0 ;

            for (int i = 1 ; i <= c ; i++) 
                  price += a * i ;
            
            System.out.println (price - b >= 0 ? price - b : 0) ;
      }
}