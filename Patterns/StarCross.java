package Patterns;
import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // square
        int n = sc.nextInt(); 
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols <= n; cols++){
                if(rows == cols || rows + cols ==  n + 1 ){
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
