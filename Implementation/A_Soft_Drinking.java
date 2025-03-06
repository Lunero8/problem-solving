// https://codeforces.com/contest/151/problem/A

import java.util.Scanner ;

public class A_Soft_Drinking {
      public static void main (String[] args) {
            Scanner sc = new Scanner(System.in) ;

            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            int c = sc.nextInt() ;
            int d = sc.nextInt() ;
            int e = sc.nextInt() ;
            int f = sc.nextInt() ;
            int g = sc.nextInt() ;
            int h = sc.nextInt() ;
            
            int r = Math.min ((b*c/g), d*e) ;

            System.out.println (Math.min (r, f/h) / a) ;
      }
}