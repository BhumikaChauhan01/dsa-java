package Patterns;

import java.util.*;

public class CharSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
        

        // ===============================================
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
        sc.close();

        // ===============================================
        // aaaa
        // BBBB
        // cccc 
        // DDDD

    }
}
