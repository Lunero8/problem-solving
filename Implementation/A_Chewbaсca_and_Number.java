import java.util.Scanner ;

public class A_Chewbacca_and_Number {
      
      public static void main (String[] args) {

            Scanner sc = new Scanner(System.in) ;

            String s = sc.next() ;

            StringBuilder result = new StringBuilder() ;

            for (int i = 0 ; i < s.length() ; i++)
            {
                  char a = s.charAt(i) ;

                  if (a == '9' && i == 0) 
                        result.append(a) ;
                  else 
                        result.append(a <= '4' ? a : (char)('9' - a + '0')) ;
            }

            System.out.println (result) ;
      }
}