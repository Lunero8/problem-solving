import java.util.Scanner ;

public class A_Beautiful_Matriz {
      public static void main (String[] args) {
            Scanner sc = new Scanner(System.in) ;

            int n = 0;
            int i = -1 ;

            while (n != 1)
            {
                  n = sc.nextInt() ;
                  i++ ;
            }

            System.out.println (Math.abs(2-(i/5)) + Math.abs(2-(i%5))) ;
      }
}