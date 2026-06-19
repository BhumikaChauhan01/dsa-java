package Patterns;
import java.util.*;
public class VerticalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1;  i <= n;  i++){
            int a = 1;
            for(int j = 1; j <= n + 1 - i; j++){
                System.out.print("  "); //spaces 
            }
            for(int k = 1; k <= i; k++){
                System.out.print(a++ + " "); //stars
            }
            System.out.println();
        }
        //=============middle pyramid=================

        // for(int i = 1;  i <= n;  i++){
        //     for(int j = 1; j <= n + 1 - i; j++){
        //         System.out.print(" "); //spaces 
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* "); //stars
        //     }
        //     System.out.println();
        // }

        // ============  char =================

        // for(int i = 1;  i <= n;  i++){
            
        //     for(int j = 1; j <= n + 1 - i; j++){
        //         System.out.print("  "); //spaces 
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print((char)(k+64) + " "); //stars
        //     }
        //     System.out.println();
        // }

        //============== star ======================

        // for(int i = 1;  i <= n;  i++){
            
        //     for(int j = 1; j <= n + 1 - i; j++){
        //         System.out.print("  "); //spaces 
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* "); //stars
        //     }
        //     System.out.println();
        // }
        
        sc.close();
    }
}
