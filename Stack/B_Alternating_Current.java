/**
 *    author:  Lunero
 *    created: 02.10.2025 10:05:51
**/
import java.util.* ;

public class B_Alternating_Current {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            String s = sc.next() ;

            Stack<Character> stack = new Stack<>() ;

            for (int i = 0 ; i < s.length() ; i++) {
                  if (stack.empty() || stack.peek() != s.charAt(i))
                        stack.push(s.charAt(i)) ;
                  else
                        stack.pop() ;
            }

            System.out.println (stack.empty() ? "Yes" : "No") ;
      }
}