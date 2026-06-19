package Patterns;

import java.util.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }

            number /= 10;

        }
        System.out.println("sum of even numbers: " + sumEven);
        System.out.println("sum of odd numbers: " + sumOdd);

        sc.close();
    }

}
