package Patterns;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;

        while (num > 0) {
            int r = num % 10;
            counter += r;
            num = num / 10;
        }
        System.out.println(counter);

        sc.close();
    }
    

}
