/**
 *    author:  Lunero
 *    created: 29.07.2025 14:39:16
**/
import java.util.* ;

public class A_Text_Volume {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int n = sc.nextInt() ;
            sc.nextLine() ;
            
            String s = sc.nextLine() ;

            int max = 0 ;
            int count = 0 ;

            for (int i = 0 ; i < n ; i++)
            { 
                  if (s.charAt(i) > 64 && s.charAt(i) < 91)
                        count++ ;

                  if (s.charAt(i) == ' ')
                  {
                        max = Math.max (max, count) ;
                        count = 0 ;
                  }
            }

            
            System.out.println (Math.max (max, count)) ;
      }
}