package Patterns;
import java.util.*;

public class SquareStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int rows = 1; rows <= num1; rows++){
            for(int cols = 1; cols <= num2; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
