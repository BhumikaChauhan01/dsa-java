package Loops;

import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num = sc.nextInt();
        int j = 0;

        if (num == 1 || num == 0) {
            System.out.println("neither prime nor composite");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    j = 1;
                }

            }
            if (j == 1) {
                System.out.println("composite");
            } else {
                System.out.println("prime");
            }
        }
        sc.close();

    }
}
