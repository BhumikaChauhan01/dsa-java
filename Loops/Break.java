package Loops;

import java.util.*;

public class Break {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;

            }
            System.out.println(n);
        } while (true);

    }
}
