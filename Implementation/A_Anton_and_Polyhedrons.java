/**
 *    author:  Lunero
 *    created: 23.08.2025 11:34:08
**/
import java.util.* ;

public class A_Anton_and_Polyhedrons {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in) ;

            int t = sc.nextInt() ;

            int totalFaces = 0 ;

            while (t-- > 0) {
                  String s = sc.next() ;

                  if ("Tetrahedron".equals(s))
                        totalFaces += 4 ;
                  else if ("Cube".equals(s))
                        totalFaces += 6 ;
                  else if ("Octahedron".equals(s))
                        totalFaces += 8 ;
                  else if ("Dodecahedron".equals(s))
                        totalFaces += 12 ;
                  else 
                        totalFaces += 20 ;
            }

            System.out.println (totalFaces) ;
      }
}