package Arrays;

import java.util.*;

public class question {
    public static void main(String[] args) {
        // multiple odd indexes by 2 and add 10 in even indexes

        int[] arr = new int[5];
        input(arr);
        checking(arr);
        output(arr);

    }

    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void checking(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }

        }
    }

    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
