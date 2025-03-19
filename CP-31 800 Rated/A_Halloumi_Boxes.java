import java.util.Scanner ;

public class A_Halloumi_Boxes {
      public static void main (String[] args) {
            Scanner sc = new Scanner(System.in) ;

            int t = sc.nextInt() ;

            while (t-- > 0) 
            {
                  int n = sc.nextInt(), k = sc.nextInt() ;
                  boolean check = true ;
                  int[] a = new int[n] ;

                  for (int i = 0 ; i < n ; i++)
                  {
                        a[i] = sc.nextInt() ;

                        if (i > 0 && a[i] < a[i-1])
                        {
                              check = false ;

                              for (int j = i+1 ; j < n ; j++)
                                    a[j] = sc.nextInt() ;
                              
                              break ;
                        }
                  }

                  /*
                  for (int i = 0 ; i < n ; i++)
                  {
                        a[i] = sc.nextInt() ;

                        if (i > 0 && a[i] < a[i-1])
                              check = false ;
                  }
                  */

                  if (check == true || k > 1)
                        System.out.println ("YES") ;
                  else
                        System.out.println ("NO") ;
            }
      }
}