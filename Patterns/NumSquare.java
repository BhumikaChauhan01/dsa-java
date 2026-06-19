package Patterns;

import java.util.*;

public class NumSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
        // =====================================
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                System.out.print(i + " ");
            }

            System.out.println();
        }


        sc.close();
    }
}
