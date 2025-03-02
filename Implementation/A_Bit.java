import java.util.Scanner ;

public class A_bit {

      public static void main (String[] args) {
            
            Scanner sc = new Scanner(System.in) ;

            int n = sc.nextInt() ;

            int result = 0 ;

            while (n-- > 0)
            {
                  String s = sc.next() ;

                  if (s.contains("+"))
                        result++ ;
                  else
                        result-- ;
            }

            System.out.println (result) ;
      }
}