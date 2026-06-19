package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n and m must be odd
        int m = sc.nextInt(); //rows
        int n = sc.nextInt(); //cols
        for(int rows = 1; rows <= m; rows++){
            for(int cols = 1; cols <= n; cols++){
                if(rows == ((m/2) + 1 ) || cols == ( (n/2) + 1) ){
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
