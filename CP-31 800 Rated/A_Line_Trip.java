import java.util.Scanner ;

public class A_Line_Trip {
      public static void main (String[] args) {
            Scanner sc = new Scanner(System.in) ;

            int t = sc.nextInt() ;

            while (t-- > 0)
            {
                  int a = sc.nextInt(), b = sc.nextInt() ;

                  int result = 0;
                  int temp = 0;

                  while (a-- > 0)
                  {
                        int c = sc.nextInt() ;

                        if (result < c - temp)
                              result = c-temp ;
                        
                        temp = c ;
                  }

                  System.out.println (Math.max(result, (b-temp)*2)) ;
            }

            sc.close() ;
      }
}