package Arrays;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 9, -9, 0, 13, 88, 90, 45, 2, 69 };
        System.out.print("THE UNSORTED ARRAY : ");
        print(arr);
        Arrays.sort(arr);
        System.out.print("THE SORTED ARRAY : ");

        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
