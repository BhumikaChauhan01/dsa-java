package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //rows
        int n = sc.nextInt(); //cols
        for(int rows = 1; rows <= m; rows++){
            for(int cols = 1; cols <= n; cols++){
                if(rows == 1 || rows == m || cols == 1 || cols == n ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
